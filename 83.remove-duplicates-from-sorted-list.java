
/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode slow = head, fast = head.next;
        while (fast != null) {
            if (fast.val == slow.val) {
                slow.next = fast.next;
                fast = fast.next;
            } else {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return head;
    }
}
// @lc code=end
