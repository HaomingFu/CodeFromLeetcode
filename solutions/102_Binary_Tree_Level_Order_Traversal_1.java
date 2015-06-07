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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(root == null) return res;
        
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        TreeNode cur =null;
        ArrayList<Integer> curLevel = new ArrayList<Integer>();
        TreeNode rightMost = root;
        TreeNode nextRightMost = null;
        while(!queue.isEmpty()){
            cur = queue.poll();
            curLevel.add(cur.val);
            if(cur.left != null){
                queue.add(cur.left);
                nextRightMost = cur.left;
            }
            if(cur.right != null){
                queue.add(cur.right);
                nextRightMost = cur.right;
            }
            if(cur == rightMost){
                res.add(curLevel);
                curLevel = new ArrayList<Integer>();
                rightMost = nextRightMost;
            }
        }
        return res;
    }
}