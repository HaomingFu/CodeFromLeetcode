class Solution:
    # @param {integer} numCourses
    # @param {integer[][]} prerequisites
    # @return {boolean}
    def canFinish(self, numCourses, prerequisites):
        if numCourses <= 1 or len(prerequisites) < 2:
            return True
        adjLists =[set() for i in range(numCourses)]
        for ix in range(len(prerequisites)):
            u, v = prerequisites[ix]
            adjList[u].add(v)
        visited = set()
        res = True
        for node in range(numCourses):
            if node not in visited:
                self.dfs(node, adjList, visited, res)
        return res        
    def dfs(self, node, adjList, visited, res):
        if -1 in adjList[node]: # set a tempeary marker
            res = False
            return 
        adjList[node].add(-1)
        for each in adjList[node]:
            if each == -1:
                continue
            self.dfs(each, adjList, visited, res):
        visited.add(node)
        a.discard(-1)
        
        