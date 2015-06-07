# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param {ListNode} head
    # @param {integer} val
    # @return {ListNode}
    def removeElements(self, head, val):
        dummyHead = ListNode(0)
        dummyHead.next = head
        iter = dummyHead
        while iter.next != None:
            if iter.next.val == val:
                iter.next = iter.next.next
            else:
                iter = iter.next
        return dummyHead.next