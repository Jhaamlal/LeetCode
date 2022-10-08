class Solution:
    def getMagic(nums):
        base=5
        ans=0
        while(nums >0):
            last=nums & 1
            nums =nums >>1
            ans +=base*last
            base=base*5
        return ans

nums=3
x=Solution.getMagic(nums)
print(x)

# THis is question from Amazon game that is given
