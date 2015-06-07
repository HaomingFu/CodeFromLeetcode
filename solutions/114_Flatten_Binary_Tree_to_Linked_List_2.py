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
        if not root:
            return 
        
        self.flatten(root.left)
        leftHead = root.left
        cur = root.left
        last = root
        while cur:
            last=cur
            cur = cur.right
        last.right = root.right
        self.flatten(root.right)
        root.right = leftHead
        