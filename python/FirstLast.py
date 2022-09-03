class Solution():
    def searchRange(self, nums, target):
        start=0
        end=len(nums)-1
        item=[-1,-1]

        if(start==end):
            if(nums[0]==target):
                return [0,0]
            else:
                return item

        while(start <=end):
            mid=start+(end-start)//2
            if(target < nums[mid]):
                end=mid-1
            elif(target>nums[mid]):
                start=mid+1
            else:
                break
        
        if(start >end):
            return item

        for i in range(mid,start-1,-1):
            if(nums[i]<target):
                item[0]=i+1
                break
            elif(nums[i]==target):
                item[0]=i
        for i in range(mid,end+1,1):
            if(nums[i] >target):
                item[1]=i-1
                break
            elif(nums[i]==target):
                item[1]=i
            else:
                if(i>0):
                    item[1]=i-1
        print(item)
        return item


nums = [5,7,7,8,8,10]
target=6
tx=Solution()
tx.searchRange(nums,target)
