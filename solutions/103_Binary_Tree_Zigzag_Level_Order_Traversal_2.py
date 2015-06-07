# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param {TreeNode} root
    # @return {integer[][]}
    def zigzagLevelOrder(self, root):
        if not root:
            return []
        res = []
        toReverse = False
        currentLevel, nextLevel = [root], []
        while currentLevel:
            vals = []
            for node in currentLevel:
                vals.append(node.val)
                if node.left:
                    nextLevel.append(node.left)
                if node.right:
                    nextLevel.append(node.right)
            if toReverse:
                res.append(vals.reverse())
                toReverse=False
            else:
                res.append(vals)
                toReverse=True
            currentLevel = nextLevel
            nextLevel = []
        return res
                
                    