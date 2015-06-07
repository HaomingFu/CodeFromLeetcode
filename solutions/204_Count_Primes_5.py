class Solution:
    # @param {integer} n
    # @return {integer}
    def countPrimes(self, n):
        if n <= 2:
            return 0
        if n == 3:
            return 1
        temp = [1]*n
        for ix in range(2, n):
            if temp[ix] == 0:
                continue
            j = 2
            while ix*j < n:
                temp[ix*j] = 0
                j += 1
        return sum(temp[2:])
                
            
        