class Solution:
    def getPosition(self, nums, target):
        start = 0
        end = 1
        # Here what we are doing is that making chunk by chunk search of element
        # is that element we are looking is in this block
        # If we find that then take that element and apply the binary search
        while (start < end):
            if (nums[start] <= target and target <= nums[end]):
                break
            else:
                start = end
                end = end*2

        while (start <= end):
            mid = start+(end-start)//2

            if (nums[mid] < target):
                start = mid+1
            elif (nums[mid] > target):
                end = mid-1
            else:
                return mid


nums = [3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170]
target = 10
x = Solution.getPosition(Solution, nums, target)
print(x)
