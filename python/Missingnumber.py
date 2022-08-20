

class Solution:
    def firstMissingPositive(self, nums):
        sortedArray = set(sorted(nums))
        n = 1
        for i in sortedArray:
            if (i > 0):
                if(i == n):
                    n += 1
                else:
                    return n
            else:
                None
        print(n)
        return n


nums = [1, 1000]
nums = [3, 4, -1, 1]
print((sorted(set(nums))))


Solution.firstMissingPositive(Solution, nums)

# Given an unsorted integer array nums, return the smallest missing positive integer.

# You must implement an algorithm that runs in O(n) time and uses constant extra space.
