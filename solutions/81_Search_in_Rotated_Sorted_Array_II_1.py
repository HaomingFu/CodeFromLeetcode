class Solution:
    # @param {integer[]} nums
    # @param {integer} target
    # @return {boolean}
    def search(self, nums, target):
        return self.binarySearch(nums, target, 0, len(nums) -1) 
 
    def binarySearch(self, nums, target, low, high):
        if high < low:
            return False
        mid = (low + high) // 2
        if nums[mid] == target:
            return True
        elif nums[mid] > target:
            if target < nums[low]:
                return self.binarySearch(nums, target, mid+1, high)
            else:
                return self.binarySearch(nums, target, low, mid - 1)
        else:
            if target < nums[low]:
                return self.binarySearch(nums, target, low, mid - 1)
            else:
                return self.binarySearch(nums, target, mid + 1, high)