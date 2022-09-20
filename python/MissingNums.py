class Solution:
    def missingNumber(self, nums):
        arlen = len(nums)-1
        i = 0
        while (arlen + 1 > i):
            if (nums[i] != i):
                if (nums[i] > arlen):
                    i += 1
                else:
                    temp = nums[nums[i]]
                    nums[nums[i]] = nums[i]
                    nums[i] = temp
            else:
                i += 1
        for i, v in enumerate(nums):
            if (i != v):
                return i

        return arlen+1


nums = []
Solution.missingNumber(Solution, nums)
print(nums)


# Better solution would not to user cyclic sort, because you are using the sorting this element
# Making things great

class BetterSol:
    def missingNumber(self, nums):
        for i in range(len(nums)+1):
            if i not in nums:
                return i


# https: // leetcode.com/problems/missing-number/
