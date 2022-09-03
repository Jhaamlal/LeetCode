var maxProfit = function (prices) {
  let left = 0
  let right = 1
  let max = 0
  while (right < prices.length) {
    if (prices[left] < prices[right]) {
      currentPrice = prices[right] - prices[left]
      max = Math.max(currentPrice, max)
    } else {
      left = right
    }
    right += 1
  }
  return max
}
prices = [7, 1, 5, 3, 6, 4]
let x = maxProfit(prices)
