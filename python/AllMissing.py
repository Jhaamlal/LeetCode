class Solution:
    def findDisappearedNumbers(self, nums):
        missingEl = []
        nums1 = set(nums)
        for i in range(1, len(nums)+1):
            if i not in nums1:
                missingEl.append(i)
        return missingEl


# nums = [4, 3, 2, 7, 8, 2, 3, 1]
# nums = [1, 1]
nums = [1, 2]

x = Solution.findDisappearedNumbers(Solution, nums)
print(x)


# Let's use cyclic sort
# class CyclicSort:
#     def findDisappeared(self,nums):
#         missEl=[]
