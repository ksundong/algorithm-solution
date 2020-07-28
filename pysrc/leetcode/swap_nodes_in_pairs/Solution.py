# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def swapPairs(self, head: ListNode) -> ListNode:
        if head and head.next:
            prev = head.next
            head.next = self.swapPairs(prev.next)
            prev.next = head
            return prev
        return head


solution = Solution()
solution.swapPairs(ListNode(1, ListNode(2, ListNode(3, ListNode(4)))))
