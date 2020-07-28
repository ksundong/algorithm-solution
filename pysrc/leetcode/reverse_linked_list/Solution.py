# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        dummy = ListNode()

        node = head
        while node:  # 노드를 순회하면서 더미 리스트의 헤드 부분에 붙인다.
            dummy.next, node.next, node = node, dummy.next, node.next

        return dummy.next


print(Solution.reverseList(None, ListNode(1, ListNode(2, ListNode(3)))))
