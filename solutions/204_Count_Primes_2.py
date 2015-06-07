class Solution:
    # @param {integer} n
    # @return {integer}
    def countPrimes(self, n):
        if n <= 2:
            return 0
        if n == 3:
            return 1
        temp = [1]*n
        ix = 2
        while ix*ix < n:
            if temp[ix] == 0:
                continue
            j = ix*ix
            while j < n:
                temp[j] = 0
                j += ix
            ix += 1
        return sum(temp[2:])
                
            
        