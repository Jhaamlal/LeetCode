# https://leetcode.com/contest/weekly-contest-310/problems/longest-increasing-subsequence-ii/
from ast import List
from turtle import st


class Solution:
    def lengthOfLIS(self, nums, k):
        start = 0
        end = start+1
        maxLen = 2
        while (end < len(nums)):
            if (nums[end] > nums[start]):
                end += 1
            else:
                if (nums[end]-nums[end-1] <= k):
                    elementLegth = nums[start]-nums[end]
                    start = end
                    end = start+1

                if (elementLegth > maxLen):
                    maxLen = elementLegth


nums = [4, 2, 1, 4, 3, 4, 5, 8, 15]
k = 3

x = Solution.lengthOfLIS(Solution, nums, k)
print(x)
