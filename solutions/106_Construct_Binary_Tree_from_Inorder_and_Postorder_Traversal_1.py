# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param {integer[]} inorder
    # @param {integer[]} postorder
    # @return {TreeNode}
    def buildTree(self, inorder, postorder):
        if not inorder or not postorder:
            return None
        
        root = TreeNode(postorder[-1])
        ix = inorder.index(root.val)
        postorder.pop()
        if ix >= len(inorder) -1:
            root.right = None
        else:
            root.right = self.buildTree(inorder[ix+1:], postorder)
        if ix <= 0:
            root.left = None
        else:
            root.left = self.buildTree(inorder[0:ix], postorder)
            
        return root