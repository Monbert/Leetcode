import javax.lang.model.util.ElementScanner6;
import javax.print.attribute.HashPrintRequestAttributeSet;

import jdk.nashorn.api.tree.WhileLoopTree;
import jdk.nashorn.internal.ir.ReturnNode;

/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// solution 1 ; Recursive
// class Solution {
//     public ListNode removeElements(ListNode head, int val) {
//         if (head == null)
//             return null;
//         head.next = removeElements(head.next, val);
//         return head.val == val ? head.next : head;
//     }
// }

// solution 2 ; Iterative
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while (temp.next != null) {
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }else{
                temp =temp.next;
            }
        }
        return dummyHead.next;
    }
}
// @lc code=end

