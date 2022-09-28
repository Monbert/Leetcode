/*
 * @lc app=leetcode id=61 lang=java
 *
 * [61] Rotate List
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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;
        ListNode slow = head, fast = head;

        // get the length of Listnode
        int i;
        for (i = 1; fast.next != null; i++) { // i和j的初始值要注意
            fast = fast.next;
        }
        System.out.println(i);
        // get the i-n%i node
        for (int j = 1; j < i - k % i; j++) {
            // for (int j = i - k % i; j > 0; j--) {
            slow = slow.next;
        }
        fast.next = head;
        head = slow.next;
        slow.next = null;

        return head;
    }
}
// @lc code=end
