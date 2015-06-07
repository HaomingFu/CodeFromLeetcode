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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode curA = headA;
        ListNode curB = headB;
        
        while(curA!=null){
            lenA++;
            curA = curA.next;
        }
        while(curB!=null){
            lenB++;
            curB = curB.next;
        }
        ListNode longList = (lenA > lenB) ? headA:headB;
        ListNode shortList = (lenA <= lenB) ? headA:headB;
        
        int diff = Math.abs(lenA - lenB);
        while(diff > 0)
            longList = longList.next;
        while(longList!=null \u0026\u0026 shortList != null \u0026\u0026 longList!=shortList){
            longList = longList.next;
            shortList = shortList.next;
        }
        if(longList != null)
            return longList;
        return null;
        
    }
}