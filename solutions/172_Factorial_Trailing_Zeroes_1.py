class Solution:
    # @param {integer} n
    # @return {integer}
    def trailingZeroes(self, n):
        if n <= 1:
            return 0
        res = 0
        temp = 5
        while n // temp:
            res += n // temp;
            temp *= 5
        return res