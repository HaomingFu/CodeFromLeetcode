class Solution:
    # @param {integer[]} nums
    # @param {integer} target
    # @return {integer}
    def search(self, nums, target):
        if not nums:
            return -1
        low, high = 0, len(nums) -1
        while low <= high:
            mid = (low + high) // 2
            if nums[mid] == target:
                return mid
            elif nums[mid] < target:
                if nums[mid] >= nums[0]:
                    low = mid + 1
                else:
                    if target <= nums[high]:
                        low = mid + 1
                    else:
                        high = mid - 1
            else:
                if nums[mid] < nums[high]:
                    high = mid - 1
                else:
                    if target > nums[high]:
                        high = mid - 1
                    else:
                        low = mid + 1
        return -1