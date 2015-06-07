# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param {TreeNode} root
    # @return {integer[]}
    def rightSideView(self, root):
        if not root:
            return []
        res = []
        queue = [root]
        while queue:
            node = queue.pop(0)
            res.append(node.val)
            if node.left:
                queue.push(node.left)
            if node.right:
                queue.push(node.right)
        return res