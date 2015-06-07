# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param {TreeNode} root
    # @return {void} Do not return anything, modify root in-place instead.
    def recoverTree(self, root):
        nodeList, valList = [],[]
        self.inOrderTraverse(root, nodeList, valList)
        valList.sort()
        for ix in range(len(valList):
            nodeList[ix].val = volList[ix]
            
    def inOrderTraverse(self, root, nodeList, valList):
        if root == None:
            return 
        self.inorderTraverse(root.left, nodeList, valList)
        nodeList.append(root)
        valList.append(root.val)
        self.inorderTraverse(root.right, nodeList, valList)