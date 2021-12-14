/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int[] dp = new int[prices.length];
        dp[0] = prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i] = Math.min(dp[i - 1], prices[i]);  //dp[i]表示截止到i，价格的最低点是多少   dp[i]=min(dp[i-1],nums[i])
            maxProfit = Math.max(maxProfit, prices[i] - dp[i]);
        }
        return maxProfit;

        /**Time exceed */
        // for (int i = 0; i < prices.length - 1; i++) {
        //     for (int j = i+1; j < prices.length; j++) {
        //         if (prices[j] > prices[i]) {
        //             maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
        //         }
        //     }
        // }
        // return maxProfit;


    }

    // public static void main(String[] args) {
    //     int[] prices = new int[] { 7, 6, 4, 3, 1 };
    //     Solution p = new Solution();
    //     p.maxProfit(prices);
    //     System.out.println(maxProfit);
    // }
}
// @lc code=end

