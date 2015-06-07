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
    public LinkedList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<ArrayList<Integer>> res = new LinkedList<ArrayList<Integer>>();
        if(root == null) return res;
        
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        TreeNode rightMost = root;
        TreeNode nextRightMost=null;
        ArrayList<Integer> curLevel = new ArrayList<Integer>();
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            curLevel.add(cur.val);
            if(cur.left != null){
                nextRightMost = cur.left;
                queue.add(cur.left);
            }
            if(cur.right != null){
                nextRightMost = cur.right;
                queue.add(cur.right);
            }
            if(cur == rightMost){
                res.push(curLevel);
                curLevel = new ArrayList<Integer>();
                rightMost = nextRightMost;
            }
        }
        return res;
    }
}