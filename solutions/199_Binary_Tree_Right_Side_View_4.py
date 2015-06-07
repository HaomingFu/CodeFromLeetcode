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
        thisLevel = [root]
        nextLevel = []
        while thisLevel:
            res.append(thisLevel[-1].val)
            for node in thisLevel:
                if node.left:
                    nextLevel.append(node.left)
                if node.right:
                    nextLevel.append(node.right)
            thisLevel = nextLevel
            nextLevel = []
        return res