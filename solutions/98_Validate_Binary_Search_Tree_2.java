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
    public static boolean isValidBST(TreeNode root){
        if (root == null ||  (root.left == null \u0026\u0026 root.right == null)) return true;
            
        boolean res;
        if (root.left != null \u0026\u0026 root.right != null)
            res = (root.val > root.left.val) \u0026\u0026 (root.val < root.right.val);
        else if (root.left == null)
            res =  (root.val < root.right.val );
        else
            res = (root.val > root.left.val);
            
        return isValidBST(root.left) \u0026\u0026 isValidBST(root.right) \u0026\u0026 res;                                                     
    }       

}