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
    public ListNode mergeKLists(List<ListNode> lists) {
        if (lists.size() == 0)
            return null;
        if (lists.size() == 1)
            return lists.get(0);
            
        int mid =  lists.size() / 2;
        ListNode l1 = mergeKLists(lists.subList(0, mid));
        ListNode l2 = mergeKLists(lists.subList( mid, lists.size()));                                                      
        return mergeTwoLists(l1, l2);
       
    }
    private static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode p = dummyHead;
        while (l1!= null \u0026\u0026 l2 != null) {
            if(l1.val < l2.val){
                p.next = l1; 
                l1 = l1.next;
            }else {
                p.next = l2; 
                l2 = l2.next;
            }   
            p = p.next;
        }   
        if (l1 != null)
            p.next = l1; 
        else
            p.next = l2; 
            
        return dummyHead.next;
    }       
   
}