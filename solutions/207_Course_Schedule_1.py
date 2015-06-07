class Solution:
    # @param {integer} numCourses
    # @param {integer[][]} prerequisites
    # @return {boolean}
    def canFinish(self, numCourses, prerequisites):
        if numCourses <= 1 or len(prerequisites) < 2:
            return True
        adjList =[set() for i in range(numCourses)]
        for ix in range(len(prerequisites)):
            u, v = prerequisites[ix]
            adjList[u].add(v)
        visited = set()
        for node in range(numCourses):
            if node not in visited:
                if self.dfs(node, adjList, visited) == False:
                    return False
        return True       
    def dfs(self, node, adjList, visited):
        if -1 in adjList[node]: # set a tempeary marker
            return False
        adjList[node].add(-1)
        for each in adjList[node]:
            if each == -1:
                continue
            if self.dfs(each, adjList, visited) == False:
                return False
        visited.add(node)
        adjList[node].discard(-1)
        return True
        
        