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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carryOn = 0;
        ListNode dummyHead = new ListNode(0);
        ListNode p = dummyHead;
        while(l1!=null \u0026\u0026 l2!=null){
            int temp = carryOn;
            carryOn = (l1.val + l2.val + temp) / 10; 
            p.next = new ListNode((l1.val + l2.val + temp) % 10);
            l1 = l1.next; l2 = l2.next; p = p.next;
        }       
                
        if(l1!= null) l2 = l1; 
        while(l2!=null){
            int temp = carryOn;
            carryOn = (l2.val + carryOn) / 10; 
            p.next = new ListNode((l2.val + temp) % 10);
            p = p.next;l2 = l2.next;
        }       
        if(carryOn == 1)
            p.next = new ListNode(carryOn);                                                                                
        return dummyHead.next;
                
        
    }
}