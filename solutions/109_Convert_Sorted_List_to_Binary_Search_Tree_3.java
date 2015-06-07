/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    private list;
    
    public TreeNode sortedListToBST(ListNode head) {
        int n = 0;                 
        ListNode p = head;         
        while (p != null){         
            n++;                   
            p = p.next;            
        }                          
        list = head;               
        return sortedListToBST(0, n - 1); 
                                   
    } 
    
    private TreeNode sortedListToBST(int low, int high){
        if(low > high) return null;
        int mid = (low + high) / 2;
        TreeNode leftChild = sortedListToBST(0, mid - 1); 
        TreeNode parent = new TreeNode(list.val);
        parent.left = leftChild;                                                                                           
        list = list.next;          
        parent.right= sortedListToBST(mid + 1, high);
        return parent;             
    }                              
}