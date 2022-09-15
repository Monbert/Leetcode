import java.util.HashMap;

/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();++i){
            char c = s.charAt(i);
            hashmap.put(c, hashmap.getOrDefault(c, 0)+1);
        }
        for(int i=0;i<s.length();++i){
            if(hashmap.get(s.charAt(i))==1){
                return i;
            }    
        }
        return -1;
    }
}
// @lc code=end

