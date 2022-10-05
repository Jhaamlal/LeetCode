# https://leetcode.com/problems/find-the-duplicate-number/

# as the is constrain we can use the bitwise oprator as we know
#   1) only one number repeat
#   2) only one repeted number
#    We can use as first solution with n^2 complexity

# Solution with n^2 complexity
class Solution1:
    def findDuplicate(self, nums):
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                # use of the bit wise oprations
                if (nums[i] ^ nums[j] == 0):
                    return nums[i]


# Next optime solution
# cyclic sort

# nums = [3, 1, 3, 4, 2]
# nums = [1, 3, 4, 2, 2]


class Solution:
    def findDuplicate(self, nums):
        i = 0
        while (i < len(nums)):
            if (nums[i] == i+1):
                i += 1
            elif (nums[i] == nums[nums[i]-1]):
                return nums[i]
            else:
                nums[nums[i]-1], nums[i] = nums[i], nums[nums[i]-1]


nums = [1, 3, 4, 2, 2]
x = Solution.findDuplicate(Solution, nums)
print(x)
