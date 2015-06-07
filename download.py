#!/usr/bin/env python
# encoding: utf-8
import requests
from lxml import etree
from StringIO import StringIO
import re, sys, os
from ConfigParser import ConfigParser

reload(sys)
sys.setdefaultencoding('utf-8')

char_map = {'\u000D':'\r', '\u000A':'\n',"\u0022":'"', '\u002C':',',
        "\u002D":'-','\u003B':';', '\u003D':'=',"\u003C":'<', "\u003E":'>'}
BASE_URL = "https://leetcode.com"

def getConfig():
    config = ConfigParser()
    config.read('config.ini')
    usr = config.get('info', 'user')
    passwd = config.get('info', 'password')
    mode = config.get('mode', 'mode')
    if not usr or not passwd:
        print "Please spcify your login info at file config.ini"
        exit()
    if mode not in ['hard', 'simple']:
        print "Pelase choose your mode from hard and simple"
        exit()
    return usr, passwd, mode

def login():
    usr, passwd, mode = getConfig()
    login_url = "https://leetcode.com/accounts/login/"
    s = requests.session()
    resp = s.get(login_url)
    csrftoken = dict(resp.cookies)['csrftoken']
    payload = {
#        'action':'/accounts/login/',
            'login':usr,
            'password':passwd,
            'csrfmiddlewaretoken':csrftoken,
            }
    header = {
            'X-Request-With':'XMLHttpRequest',
            'Connection':'Keep-Alive',
            'Accept':'text/html, application/xhtml+xml, */*',
            'User-Agent': 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0;rv:11.0) like Gecko',
            'Accept-Encoding':'gzip, deflate',
            'Referer':'https://leetcode.com/accounts/login/'
            }

    req = s.post( login_url, data=payload, headers=header)
    fh = open("index.html", "wb")
    fh.write(req.text.encode("utf-8"))
    fh.close()

    return s, req.text

def extractQuestion(html):
    parser = etree.HTMLParser()
    tree = etree.parse(StringIO(html.encode('utf-8')), parser)
    trNodes = tree.findall(".//tr")
    allProblems = []
    solvedProblems = []
    for ele in trNodes:
        if len(ele) != 5:
            continue
        if ele[0].tag != 'td':
            continue
        status = ele[0][0].get('class')
        id = ele[1].text
        href = ele[2][0].get('href')
        title = ele[2][0].text
        ac_rate = ele[3].text
        level = ele[4].text

        allProblems.append(Problem(status, id,
                href, title, ac_rate, level))
        if status != "None":
            solvedProblems.append(Problem(status, id,
                href, title, ac_rate, level))
    return allProblems, solvedProblems

def getSubmissionResults(problem, session):
    link = BASE_URL + problem.href + "submissions"
    resp = session.get(link)
    trNodes = findAllElements(resp, 'tr')
    table_nodes= findAllElements(resp, 'table')
    codeLinks = []
    for trNode in trNodes:
        if len(trNode)!= 5:
            continue
        if trNode[0].tag != 'td':
            continue
        codeLink = trNode[2][0].get('href')
        codeLinks.append(codeLink)
    return codeLinks, table_nodes

def findAllElements(response, ele_str):
    html = response.text.encode('utf-8')
    parser = etree.HTMLParser()
    tree = etree.parse(StringIO(html), parser)
    trNodes = tree.findall(".//"+ele_str)
    return trNodes

def getResultTable(table_nodes):
    if len(table_nodes) == 0:
        return ""
    return etree.tostring(table_nodes[0], pretty_print=True)

def getHTMLHead():
    resp = requests.get('https://leetcode.com')
    head_nodes = findAllElements(resp, 'head')
    head_html = etree.tostring(head_nodes[0], pretty_print=True)
    return head_html




def createReport():
    fh = open('report.html', 'w')
    fh.write("<html>")
    fh.write("""<head>
    <link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet"/>
    <link href="https://leetcode.com/static/animate/animate.css" rel="stylesheet"/>
    </head>
            """)
    fh.write("""     <body>
            <table class="table table-hover table-bordered table-striped" id="result_testcases" ng-app="statusPollerApp">
            """)
    fh.close()
def addTable2Report(problem, file, tableHTML):
    fh = open(file, 'a')
    fh.write("<thead><tr>" +str(problem.id) + " " + problem.title + "</tr></thead>")
    fh.write(tableHTML)
    fh.close()



def getCode(session, link):
    resp = session.get(link)
    scriptNodes = findAllElements(resp, 'script')
    if not scriptNodes:
        return ""
    prog = pattern()
    for script in scriptNodes:
        if not script.text:
            continue
        result = prog.search(script.text)
        if result:
            return result.group(1), result.group(2)

def formatCode(code, char_map):
    code = code.replace('\u000D\u000A', '\n')
    for key in char_map:
        if key in code:
            code = code.replace(key, char_map[key])
    return code

def writeCode2file(lang, code, id, title, no, location):
    format_map = {'python':'.py', 'java':'.java', 'cpp':'cpp'}
    ext = format_map[lang]
    file_name= str(id) + "_"+title.replace(" ", "_") + "_" + str(no) + ext
    file = os.path.join(location, file_name)
    fh = open(file, 'w')
    fh.write(code)
    fh.close()

def makeDir(dirName):
    if not os.path.exists(os.path.join(os.getcwd(),dirName)):
        os.makedirs(os.path.join(os.getcwd(), dirName))

def pattern():
    prog = re.compile("storage\.put\('(python|java|cpp)', '(.+)'\);.+storage\.put", re.DOTALL)
    return prog


class Problem:
    def __init__(self, status, id, href, title, ac_rate, level):
        self.status = status
        self.id = id
        self.href = href
        self.title = title
        self.ac_rate = ac_rate
        self.level = level


def main():
    session, html = login()
    createReport()
    makeDir('solutions')
    allProblems, solvedProblems = extractQuestion(html)
    for problem in solvedProblems:
        codeLinks, table_nodes = getSubmissionResults(problem, session)
        addTable2Report(problem, 'report.html', getResultTable(table_nodes))
        count=0
        for link in codeLinks:
            count += 1
            lang, code = getCode(session, BASE_URL + link)
            code = formatCode(code, char_map)
            writeCode2file(lang, code, problem.id, problem.title, count, 'solutions')
        print "Done with problem " + problem.title
        print
    fh=open('report.html', 'a')
    fh.write('</table></body></html>')
    fh.close()

if __name__ == "__main__":
    main()
