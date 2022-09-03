from ast import If
from operator import le


class Solution:
    def twoSum(self, nums, target):
        pointer1 = 0
        while (pointer1 < len(nums)):
            staticVal = nums[pointer1]
            pointer2 = pointer1+1
            while (pointer2 < len(nums)):
                if (staticVal+nums[pointer2] == target):
                    return [pointer1, pointer2]
                else:
                    pointer2 += 1
            pointer1 += 1


x = Solution()
nums = [3, 3]
target = 6
y = x.twoSum(nums, target)
print(y)

# Array sum
# https://leetcode.com/problems/two-sum/
