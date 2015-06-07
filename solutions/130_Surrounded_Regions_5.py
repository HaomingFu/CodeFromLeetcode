class Solution:
    # @param {character[][]} board
    # @return {void} Do not return anything, modify board in-place instead.
    def solve(self, board):
        if not board or len(board) <=2 or len(board[0]) <= 2:
            return 
        m = len(board)
        n = len(board[0])
        for ix in (0, m-1):
            for jx in (0, n-1):
                if board[ix][jx] == \u0027O\u0027:
                    self.flip(ix, jx, board, m, n)
        for ix in range(m):
            for jx in range(n):
                if board[ix][jx] == \u0027O\u0027:
                    board[ix][jx] = \u0027X\u0027
                elif board[ix][jx] == \u00271\u0027:
                    board[ix][jx] = \u0027O\u0027
    def flip(self, ix, jx, board, m, n):
        if board[ix][jx] != \u0027O\u0027:
            return 
        board[ix][jx] = \u00271\u0027
        queue = [(ix,jx)]
        while not queue:
            ix, jx = queue.pop(0)
            if ix - 1 >= 0 and board[ix-1][jx] == \u0027O\u0027:
                board[ix-1][jx] = \u00271\u0027
                queue.append((ix-1, jx))
            if ix + 1 < m and board[ix+1][jx] == \u0027O\u0027:
                board[ix-1][jx] = \u00271\u0027
                queue.append((ix+1, jx))
            if jx - 1 >= 0 and board[ix][jx-1] == \u0027O\u0027:
                board[ix-1][jx] = \u00271\u0027
                queue.append((ix, jx-1))
            if jx + 1 < n and board[ix+1][jx] == \u0027O\u0027:
                board[ix-1][jx] = \u00271\u0027
                queue.append((ix, jx+1))
        
                