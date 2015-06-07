class Solution:
    # @param {integer[]} nums
    # @param {integer} target
    # @return {integer[]}
    def searchRange(self, nums, target):
        if len(nums) < 1:
            return [-1, -1]
        return self.bs(nums, target, 0, len(nums)-1)
            
    def bs(self, nums, target, low, high):
        if low > high:
            return [-1, -1]
        mid = (low + high) // 2
        if nums[mid] == target:
            l_low, l_high = self.bs(nums, target, low,mid - 1)
            r_low, r_high = self.bs(nums, target, mid+1, high)
            low = l_low if l_low >= 0 else mid
            high = r_high if r_high >=0 else mid
            return [low, high]
        elif nums[mid] > target:
            return self.bs(nums, target, low, mid - 1)
        else:
            return self.bs(nums, target, mid + 1, high)