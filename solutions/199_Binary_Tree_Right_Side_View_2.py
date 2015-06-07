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
        queue = [root]
        res = []
        while queue:
            size = len(queue)
            for r in len(size):
                top = queue.pop(0)
                if r == 0:
                    res.append(top.val)
                if top.right:
                    queue.append(top.right)
                if top.left:
                    queue.append(top.left)
        return res
                
                    

            