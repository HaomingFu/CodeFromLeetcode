class Solution:
    # @param n, an integer
    # @return an integer
    def reverseBits(self, n):
        res = 0
        for i in range(0, 11):
            res = res << 1 + n \u0026 1
            n <<= 1
        return res