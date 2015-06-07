# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param {TreeNode} root
    # @return {void} Do not return anything, modify root in-place instead.
    def flatten(self, root):
        stack = []
        p = root
        while p != None or stack:
            if p.right:
                stack.append(p.right)
            if p.left:
                p.right = p.left
                p.left = None
            elif stack:
                p.right = stack.pop()
            p = p.right