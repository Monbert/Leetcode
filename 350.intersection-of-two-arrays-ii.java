import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=350 lang=java
 *
 * [350] Intersection of Two Arrays II
 */

// @lc code=start
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int topIndex = 0, bottomIndex = 0;
        List<Integer> h = new ArrayList<>();

        while (true) {
            if (topIndex > nums1.length - 1 || bottomIndex > nums2.length - 1) {
                break;
            }
            if (nums1[topIndex] == nums2[bottomIndex]) {
                h.add(nums1[topIndex]);
                topIndex++;
                bottomIndex++;
            } else if (nums1[topIndex] > nums2[bottomIndex]) {
                bottomIndex++;
            } else if (nums1[topIndex] < nums2[bottomIndex]) {
                topIndex++;
            }
        }
        int[] g = new int[h.size()];
        for (int i = 0; i < h.size(); ++i) {
            g[i] = h.get(i);
        }
        return g;
    }
}
// @lc code=end

