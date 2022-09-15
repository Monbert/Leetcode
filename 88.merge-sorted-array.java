import java.util.Arrays;

/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

@lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m - 1;
        int tail2 = n - 1;
        int finished = m + n - 1;
        while (tail1 >= 0 && tail2 >= 0) {
            nums1[finished--] = nums1[tail1] > nums2[tail2] ? nums1[tail1--] : nums2[tail2--];
            System.out.println(finished);
            System.out.println(tail1+"@@@");
            System.out.println(tail2+"###");
        }
        /**For the case: [0]\n0\n[1]\n1 */
        while (tail2 >= 0) {
            nums1[finished--] = nums2[tail2--]; 
        }

    }
}

// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int p1 = m - 1, p2 = n - 1;
//         int tail = m + n - 1;
//         int cur;
//         while (p1 >= 0 || p2 >= 0) {
//             if (p1 == -1) {
//                 cur = nums2[p2--];
//             } else if (p2 == -1) {
//                 cur = nums1[p1--];
//             } else if (nums1[p1] > nums2[p2]) {
//                 cur = nums1[p1--];
//             } else {
//                 cur = nums2[p2--];
//             }
//             nums1[tail--] = cur;
//         }
//     }
// }



// @lc code=end
