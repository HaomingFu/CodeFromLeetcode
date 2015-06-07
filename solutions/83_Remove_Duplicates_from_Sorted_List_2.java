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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pt = head;
        while(pt.next != null){
            if(pt.val == pt.next.val){
                pt.next = pt.next.next;
            }
            else
                pt = pt.next;
        }
        
        return head;
    }
}