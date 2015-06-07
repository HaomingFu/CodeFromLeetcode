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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p!=null \u0026\u0026 q!= null){ 
            return p.val == q.val \u0026\u0026 
            isSameTree(p.left, q.left) \u0026\u0026 
            isSameTree(p.right, q.right);
        }
        if(p == null \u0026\u0026 q == null)
            return true;
        return false;
    }
}