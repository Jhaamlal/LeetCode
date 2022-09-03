# class Solution:
#     def maxProfit(self, prices):
#         max = 0
#         for i in range(len(prices)-1, 0, -1):
#             nums = i-1
#             while (nums >= 0):
#                 if (max < prices[i]-prices[nums]):
#                     max = prices[i]-prices[nums]
#                     nums -= 1
#                 else:
#                     nums -= 1
#         return max

# class Solution:
#     def maxProfit(self, prices):
#         max = 0
#         for i in range(0, len(prices)-1):
#             nums = i+1
#             while (nums <= len(prices)-1):
#                 x = prices[nums]-prices[i]
#                 if (max < x):
#                     max = x
#                     nums += 1
#                 else:
#                     nums += 1
#         return max

# class Solution:
#     def maxProfit(self, prices):
#         max = 0
#         for i in range(0, len(prices)-1):
#             maxVal = sorted(prices[i+1:], reverse=True)
#             x = maxVal[0]-prices[i]
#             if (x > max):
#                 max = x
#         return max


# From leetcode solution
# The thing is
# Tring to get the least number and
# Trying to find the minimum value
class Solution:
    def maxProfit(self, prices):
        left = 0  # Buy
        right = 1  # Sell
        max_profit = 0
        while right < len(prices):
            currentProfit = prices[right] - prices[left]  # our current Profit
            if prices[left] < prices[right]:
                max_profit = max(currentProfit, max_profit)
            else:
                left = right
            right += 1
        return max_profit


prices = [7, 1, 5, 3, 6, 4]
x = Solution.maxProfit(Solution, prices)
print(x)
