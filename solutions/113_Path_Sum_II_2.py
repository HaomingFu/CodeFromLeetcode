# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param {TreeNode} root
    # @param {integer} sum
    # @return {integer[][]}
    def pathSum(self, root, sum):
        res = []
        self.pathSumRecur(root, sum, res, [])
        return res
        
    def pathSumRecur(self, root, target, res, path):
        if not root:
            return
        if not root.right and not root.left and root.val == target:
            path.append(root.val)
            res.append(res)
            return
        path.append(root.val)
        self.pathSumRecur(root.left, target - root.val, res, list(path))
        self.pathSumRecur(root.right, target-root.val, res, path)
        
        