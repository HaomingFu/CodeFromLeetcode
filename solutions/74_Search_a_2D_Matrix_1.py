class Solution:
    # @param {integer[][]} matrix
    # @param {integer} target
    # @return {boolean}
    def searchMatrix(self, matrix, target):
        if not matrix:
            return False
        ix = self.findRow(matrix, target)
        if ix < 0 :
            return False
        else:
            return self.bs(matrix, target, ix)
    
    def findRow(self, matrix, target):
        low, high = 0, len(matrix) - 1
        while low <= high:
            mid = (low + high) // 2
            if matrix[mid][0] == target:
                return mid
            elif matrix[mid][0] > target:
                high = mid - 1
            else:
                low = mid + 1
        return min(low, high)
    def bs(self, matrix, target, ix):
        low, high = 0, len(matrix[ix]) -1
        while low <= high:
            mid = (low + high) // 2
            if matrix[ix][mid] == target:
                return True
            elif matrix[ix][mid] > target:
                high = mid - 1
            else:
                low = mid + 1
        return False