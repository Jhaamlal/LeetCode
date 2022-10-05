# https://leetcode.com/problems/find-all-duplicates-in-an-array/
class Solution:
    def findDuplicates(self, nums):
        # make a
        arr = []
        for i in set(nums):
            if (nums.count(i) > 1):
                if i not in arr:
                    arr.append(i)
        return arr

# Now WIll use cyclic sort for that


class CyclicSort:
    def findTheDuplicate(self, nums):
        i = 0
        arr = []
        while (i < len(nums)):
            if (nums[i] == i+1):
                i += 1
            elif (nums[i] == nums[nums[i]-1]):
                if nums[i] not in arr:
                    arr.append(nums[i])
                i += 1
            else:
                nums[nums[i]-1], nums[i] = nums[i], nums[nums[i]-1]
        return arr


# Change in cyclic sort approch for the things


nums = [4, 3, 2, 7, 8, 2, 3, 1]
x = CyclicSort.findTheDuplicate(CyclicSort, nums)
print(x)
