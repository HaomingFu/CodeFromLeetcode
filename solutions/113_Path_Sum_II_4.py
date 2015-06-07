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
            if target == 0:
                res.append(path)
            else:
                return
        path.append(root.val)
        self.pathSumRecur(root.left, target - root.val, res, list(path))
        self.pathSumRecur(root.right, target-root.val, res, path)
        
        