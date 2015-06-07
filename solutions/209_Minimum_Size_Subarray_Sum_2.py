class Solution:
    # @param {integer} s
    # @param {integer[]} nums
    # @return {integer}
    def minSubArrayLen(self, s, nums):
        if not nums or sum(nums) < s:
            return 0
        T = [[0]*len(nums) for i in range(len(nums))]
        minLen = len(nums)
        for j in range(0, len(nums)):
            for i in range(j+1):
                if i == j:
                    T[i][j] = nums[i]
                else:
                    T[i][j] = T[i][j-1] + nums[j]
                if T[i][j] >= s and minLen > j - i + 1:
                    minLen = j-i+1
        return minLen