class Solution:
    # @param {integer} n
    # @return {boolean}
    def isHappy(self, n):
        temp = set([n])
        while n != 1:
            n = self.getDigitSquare(n)
            if n in temp:
                return True if n == 1 else False
            else:
                temp.add(n)
        return True
            
            
    def getDigitSquare(self, n):
        sum = 0
        while n :
            sum  += (n % 10)**2;
            n = n / 10;
        return sum
        