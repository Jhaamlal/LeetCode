from enum import unique
import numbers


class Solution:
    def findUniue(nums):
        uni=0
        for i in nums:
            uni ^=i
        return uni

nums=[2,3,4,1,1,2,3,4,6]
x=Solution.findUniue(nums)
print(x)