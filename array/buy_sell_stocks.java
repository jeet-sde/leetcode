public class buy_sell_stocks {
    static class Solution {
        public int maxProfit(int[] prices) {
            if (prices == null || prices.length == 0) return 0;
    
            int buy = prices[0], max_profit = 0;
    
            for (int i = 1; i < prices.length; i++) {
                if (buy > prices[i]) {
                    buy = prices[i];
                } else if (prices[i] - buy > max_profit) {
                    max_profit = prices[i] - buy;
                }
            }
            return max_profit;
        }
    
        public static void main(String[] args) {
            int prices[] = {7, 1, 5, 6, 4};
            Solution solution = new Solution();
            int max_profit = solution.maxProfit(prices);
            System.out.println(max_profit); // Output should be 5
        }
    }
}
