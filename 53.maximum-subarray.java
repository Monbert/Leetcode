/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start

//DP
class Solution {
    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int i : nums) {
            pre = Math.max(pre + i, i);  //若前一个元素>0，则将其加到当前元素上
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}
// @lc code=end

