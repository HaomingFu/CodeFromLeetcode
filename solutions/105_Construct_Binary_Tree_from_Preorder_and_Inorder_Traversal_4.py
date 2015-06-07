# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param {integer[]} preorder
    # @param {integer[]} inorder
    # @return {TreeNode}
    def buildTree(self, preorder, inorder):
        if not preorder or not preorder:
            return None
        if len(preorder) == 1:
            return TreeNode(preorder[0])
        root = TreeNode(preorder[0])
        preorder.pop()
        ix = inorder.index(root.val)
        root.left = self.buildTree(preorder, inorder[0:ix])
        if ix >= len(inorder):
            root.right= None
        else:
            root.right = self.buildTree(preorder, inorder[ix+1:])
        return root