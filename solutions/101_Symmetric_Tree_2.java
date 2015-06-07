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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSame(root.left, root.right);
    }
    private boolean isSame(TreeNode n1, TreeNode n2){
        if(n1==null \u0026\u0026 n2 == null) return true;
        
        if(n1 != null \u0026\u0026 n2 != null)
            return n1== n2 \u0026\u0026 isSame(n1.left, n2.right) \u0026\u0026 isSame(n1.right, n2.left);
        return false;
    }
}