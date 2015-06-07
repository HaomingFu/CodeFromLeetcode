class Solution:
    # @param {character[][]} grid
    # @return {integer}
    def numIslands(self, grid):
        m = len(grid)
        if m == 0:
            return 0
        res = 0
        visited = set()
        n = len(grid[0])
        for ix in range(m):
            for jx in range(n):
                if grid[ix][jx] == 0:
                    continue
                if (ix, jx) not in visited:
                    res += 1
                    self.traverse(ix, jx, visited, grid, m, n)
                else:
                    continue
    def traverse(self, ix, jx, visited, grid, m, n):
        if 0<=ix<m and 0<=jx<n:
            visited.add((ix, jx))
        else:
            return 
        self.traverse(ix-1, jx, visited, grid, m,n)
        self.traverse(ix+1, jx, visited, grid, m, n)
        self.traverse(ix, jx-1, visited, grid, m, n)
        self.traverse(ix, jx+1, visited, grid, m, n)
        