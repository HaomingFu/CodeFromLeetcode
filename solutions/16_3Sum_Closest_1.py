class Solution:
    # @param {integer[]} nums
    # @param {integer} target
    # @return {integer}
    def threeSumClosest(self, nums, target):
        if len(nums) < 3:
            return 0
        nums.sort()
 
        sum = nums[0] + nums[1] + nums[-1]
        minDiff = abs(target-sum)
        res = sum 
        for ix in range(len(nums) - 2): 
            jx, kx = ix + 1, len(nums) - 1 
            while jx < kx: 
                sum = nums[jx] + nums[kx] + nums[ix]
                if minDiff > abs(target-sum):
                    minDiff = abs(target-sum)
                    res = sum 
                if sum > target:
                    kx -= 1
                elif sum < target:
                    jx += 1
                else:
                    return sum 
        return res 