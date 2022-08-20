class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        nums = [1,2,3,4]
        newList=[]
        for i in range(len(nums)):
            if(i==0):
                prev=nums[i]
                newList.append(prev)
            else:
                prev=prev+nums[i]
                newList.append(prev)
        print(nums)
        return newList