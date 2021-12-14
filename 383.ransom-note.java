/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26]; //should be int[26]
        for (int i = 0; i < magazine.length(); ++i) {
            count[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); ++i) {
            if (count[ransomNote.charAt(i) - 'a'] == 0) {
                return false;
            }
            count[ransomNote.charAt(i) - 'a']--;
        }
        return true;
    }
}
// @lc code=end

