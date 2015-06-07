class Solution:
    # @param {integer[]} nums
    # @param {integer} target
    # @return {boolean}
    def search(self, nums, target):
        if len(nums) < 1:
            return False
        return self.binarySearch(nums, target, 0, len(nums) -1)
        
    def binarySearch(self, nums, target, low, high):
        if high < low:
            return False
        mid = (low + high) // 2
        if nums[mid] == target:
            return True
        elif nums[mid] > target:
            if nums[mid] > nums[low]:
                return self.binarySearch(nums, target, low, mid - 1)
            else:
                if target < nums[high]:
                    return self.binarySearch(nums, target, low, mid-1)
                else:
                    return self.binarySearch(nums, target, mid+1, high)
        else:
            if nums[mid] > nums[low]:
                return self.binarySearch(nums, target, mid + 1, high)
            else:
                if target > nums[high]:
                    return self.binarySearch(nums, target, low, mid - 1)
                else:
                    return self.binarySearch(nums, target, mid + 1, high)