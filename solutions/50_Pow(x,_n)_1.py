class Solution:
    # @param {float} x
    # @param {integer} n
    # @return {float}
    def myPow(self, x, n): 
        sign = 1
        if n < 0:
            sign, n = -1, -n
        res, temp = 1, x 
        while n > 0:
            if n % 2 == 1:
                res = res*temp
            n = n // 2
            temp = temp*temp
        return res if sign > 0 else 1/ res
 

                