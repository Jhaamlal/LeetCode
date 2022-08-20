from typing import List


class Solution:
    def buildArray(self,nums:List[int]) ->List[int]:
        arrLength=len(nums)
        newList=[]
        for i in range(arrLength):
            newList.append(nums[nums[i]])
        return newList