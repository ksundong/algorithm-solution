# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverseBetween(self, head: ListNode, m: int, n: int) -> ListNode:


solution: Solution = Solution()
solution.reverseBetween(ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5, None))))), 2, 4)
