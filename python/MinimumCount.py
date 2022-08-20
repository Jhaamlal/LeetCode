class Solution:
    def minCostToMoveChips(self, position: List[int]) -> int:
        eventCount=0
        oddCount=0
        for i in position:
            if(i%2==0):
                eventCount +=1
            else:
                oddCount +=1
        return min(eventCount,oddCount)


# https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/

# We have n chips, where the position of the ith chip is position[i].

# We need to move all the chips to the same position. In one step, we can change the position of the ith chip from position[i] to:

# position[i] + 2 or position[i] - 2 with cost = 0.
# position[i] + 1 or position[i] - 1 with cost = 1.
# Return the minimum cost needed to move all the chips to the same position.

