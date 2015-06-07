class Solution:
    # @param {integer} n
    # @return {boolean}
    def isHappy(self, n):
        temp = set([n])
        while n != 1:
            sum = self.getDigitSquare(n)
            if sum in temp:
                return True if sum == 1 else False
            else:
                temp.add(sum)
        return True
            
            
    def getDigitSquare(self, n):
        sum = 0
        while n :
            sum  += (n % 10)**2;
            n = n / 10;
        return sum
        