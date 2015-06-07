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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode fast = dummyHead;
        while( n-- > 0){
            fast = fast.next;
        }
        ListNode slow = dummyHead;
        while(fast.next!= null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        
        return dummyHead.next;
    }
}