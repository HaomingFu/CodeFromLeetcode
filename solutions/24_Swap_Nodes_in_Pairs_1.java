/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
       ListNode dummyHead = new ListNode(0);                                                                              
        dummyHead.next = head;
        ListNode p = head;
        ListNode prev = dummyHead;
 
        while (p != null \u0026\u0026 p.next != null){
            prev.next = p.next;
            p.next = p.next.next;
            prev.next.next = p;
            prev = p;
            p = p.next;
        }   
        return dummyHead.next;       
    }
}