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
            
        root = TreeNode(preorder[0])
        preorder.pop(0)
        ix = inorder.index(root.val)
        if ix > 0:
            root.left = self.buildTree(preorder, inorder[0:ix])
        else:
            root.left = None
        if ix >= len(inorder)-1:
            root.right= None
        else:
            root.right = self.buildTree(preorder, inorder[ix+1:])
            
        return root