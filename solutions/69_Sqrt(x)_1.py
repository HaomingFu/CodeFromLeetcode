class Solution:
    # @param {integer} x
    # @return {integer}
    def mySqrt(self, x):
        if x < 1:
            return 0
        if x <= 3:
            return 1
        return self.binarySearch(x)
        
    def binarySearch(self, x):
        low, high = 1, x // 2
        while low <= high:
            mid = (low + high) // 2
            if mid*mid == x:
                return mid
            elif mid*mid < x:
                low = mid + 1
            else:
                high = mid - 1
        return min(low, high)