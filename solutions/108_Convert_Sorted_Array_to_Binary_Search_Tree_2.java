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
    public TreeNode sortedArrayToBST(int[] num) {
        return helper(num, 0, num.length - 1);
    }
    private TreeNode helper(int [] num, int low, int high){
       if(low > high) return null;
       int mid = (low + high) / 2;
       TreeNode root = new TreeNode(num[mid]);
       root.left = helper(num, low, mid - 1));
       root.right = helper(num, mid + 1, high);
       return root;
    }
}