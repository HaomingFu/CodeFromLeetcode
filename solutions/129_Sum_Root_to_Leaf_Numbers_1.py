# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param {TreeNode} root
    # @return {integer}
    def sumNumbers(self, root):
        if not root:
            return 0
        queue = [root]
        total = 0
        while queue:
            node = queue.pop(0)
            if node.left:
                node.left.val = node.val * 10 + node.left.val
                queue.append(node.left)
            if node.right:
                node.right.val = node.val * 10 + node.right.val
                queue.append(node.right)
            if not node.left and not node.right:
                total += node.val
        return total