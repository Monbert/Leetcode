import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        // HashMap
        Map<Integer, Integer> Map = new HashMap<Integer, Integer>();
        int res = 0;
        for (int num : nums) {
            if (!Map.containsKey(num)) {
                Map.put(num, 1);
            } else {
                Map.put(num, Map.get(num) + 1);
            }
            if (Map.get(num) > nums.length / 2) {
                res = num;
                break;
            }
        }
        return res;
    }
}
// @lc code=end
