from array import array
from xml.dom.minidom import Element


class Solution:
    def mostFrequentEven(self, nums):
        dictionary = {}
        max = 0
        maxElement = -1

        for v in nums:
            if (v in dictionary):
                dictionary[v] = dictionary[v]+1
                if (dictionary[v] > max):
                    max = dictionary[v]
                    maxElement = v
            else:
                dictionary[v] = 1
        if (len(nums) == 1):
            return dictionary[0]
        else:
            return maxElement


# nums = [0, 1, 2, 2, 4, 4, 1]
# nums = [29, 47, 21, 41, 13, 37, 25, 7]
nums = [0, 0, 0, 0]

c = Solution.mostFrequentEven(Solution, nums)
print(c)
