class Solution:
    # @param {float} x
    # @param {integer} n
    # @return {float}
    def myPow(self, x, n): 
        res = 1 
        temp = x 
        while n > 0:
            if n % 2 == 1:
                res = res*temp
            n = n // 2
            temp = temp*temp
        return res 
 

                