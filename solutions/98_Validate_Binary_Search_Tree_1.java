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
    public boolean isValidBST(TreeNode root){
        return valid(root, null, null);                                             
    } 
        private static boolean valid(TreeNode p, Integer low, Integer high){
        if(p == null) return true;                                                                                         
        return (low == null || p.val > low) \u0026\u0026 (high == null || p.val < high) 
            \u0026\u0026 valid(p.left, low, p.val)
            \u0026\u0026 valid(p.right, p.val, high);
    }                                


}