/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        // 快慢指针 --> m = x + n(k-1)
        ListNode slow = head, fast = head;
        while (fast != null && fast.next!=null) {   //循环条件判断
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                while (head != fast) {
                    head = head.next;
                    fast = fast.next;
                }
                return head;
            }
        }
        return null;
    }
}
// @lc code=end

