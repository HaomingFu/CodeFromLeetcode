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
        path.append(root.val)
        if not root.right and not root.left and root.val == target:
            res.append(path)
            return
        self.pathSumRecur(root.left, target - root.val, res, list(path))
        self.pathSumRecur(root.right, target-root.val, res, path)
        
        