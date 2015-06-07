class Solution:
    # @param {integer[]} nums
    # @return {integer}
    def rob(self, nums):
        if not nums:
            return 0
            
        maxTemp, endsIn = [0]*len(nums), [0]*len(nums)
        maxTemp[0], endsIn[0] = nums[0], nums[0]
        for ix in range(1, len(nums)):
            if ix >= 2:
                endsIn[ix] = nums[ix] + maxTemp[ix-2]
            else:
                endsIn[ix] = nums[ix]
            maxTemp[ix] = max(maxTemp[ix-1], endsIn[ix])
        return maxTemp[-1]
        