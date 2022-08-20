class Solution(object):
    def shuffle(self, nums, n):
        """
        :type nums: List[int]
        :type n: int
        :rtype: List[int]
        """
        newList=[]
        for i in range(n):
            newList.append(nums[i])
            newList.append(nums[i+n])
        return newList

# // Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

# // Return the array in the form [x1,y1,x2,y2,...,xn,yn].