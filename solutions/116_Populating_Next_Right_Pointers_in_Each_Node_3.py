# Definition for binary tree with next pointer.
# class TreeLinkNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
#         self.next = None

class Solution:
    # @param root, a tree link node
    # @return nothing
    def connect(self, root):
        if not root:
            return 
        rightMost = root
        queue = [root]
        pre = root
        while queue:
            cur = queue.pop(0)
            if cur.left:
                queue.append(cur.left)
            if cur.right:
                queue.append(cur.right)
            if pre == rightMost:
                pre = cur
            else:
                pre.next = cur
                pre = cur
            if rightMost.right == cur:
                rightMost = cur
            
            