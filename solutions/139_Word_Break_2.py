class Solution:
    # @param s, a string
    # @param wordDict, a set<string>
    # @return a boolean
    def wordBreak(self, s, wordDict):
        T = [False]*(len(s)+1)
        T[0] = True
        for ix in range(0, len(T)):
            if not T[ix]:
                continue
            for aWord in wordDict:
                length = len(aWord)
                if ix + length > len(T):
                    continue
                if T[ix + length]:
                    continue
                elif s[ix:ix+length] == aWord:
                    T[ix+length] = True
        return T[-1]