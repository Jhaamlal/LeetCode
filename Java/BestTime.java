package Java;

public class BestTime {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int res = maxProfit(prices);
        System.out.println(res);

    }

    public static int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int max = 0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int currentPrice = prices[right] - prices[left];
                max = Math.max(currentPrice, max);
            } else {
                left = right;
            }
            right += 1;
        }
        return max;
    }
}
