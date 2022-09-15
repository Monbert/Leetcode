import javax.sound.midi.Soundbank;

/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {

    //暴力解法
    // public int removeElement(int[] nums, int val) {
    //     int[] resArr = new int[nums.length];
    //     int res = nums.length;
    //     int j =0;
    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i] == val) {
    //             res--;
    //         } else {
    //             resArr[j++] = nums[i];
    //         }
    //     }
    //     for (int i = 0; i < resArr.length; i++) {
    //         nums[i] = resArr[i];
    //     }
    //     return res;
    // }

    //双指针
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int n = nums.length;
        for (int right = 0; right < n; right++) {
            if (nums[right] != val) {
                nums[left++] = nums[right];
            }
        }
        return left;
    }

}
// @lc code=end

