from tkinter import N


class Solution:
    def firstMissingPositive(self, nums):
        i = 0
        # for i, val in enumerate(nums):
        #     if (i == val-1):
        #         pass
        #     else:
        #         # if the value-i is in range of the element
        #         if (val <= len(nums)-1 and val > 0):
        #             nums[val-1], nums[i] = val, nums[val-1]
        #             i -= 1
        #         elif (val < 0):
        #             i += 1
        while (i < len(nums)):
            if (i == nums[i+1]-1):
                i += 1
            elif (i != nums[i]-1):
                if (nums[i]-1 <= len(nums) and nums[i] > 0):
                    nums[nums[i]-1], nums[i] = nums[i], nums[nums[i]-1]
                    i = i

                elif (nums[i] <= 0):
                    i += 1
                else:
                    print(i+1)
                    return i+1


                    # nums = [1, 2, 0]
                    # nums = [0]
nums = [3, 4, -1, 1]
# nums = [7, 8, 9, 11, 12]

Solution.firstMissingPositive(Solution, nums)
