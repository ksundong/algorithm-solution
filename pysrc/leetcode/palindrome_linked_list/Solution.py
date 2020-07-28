# Definition for singly-linked list.
from collections import deque
from typing import Deque


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def isPalindrome(self, head: ListNode) -> bool:
        # deque 선언 및 저장
        nodes: Deque = deque()

        if not head:  # head가 None이면...
            return True

        node = head
        while node is not None:
            nodes.append(node.val)
            node = node.next

        # deque의 앞 뒤를 비교해서 다르면 팰린드롬이 아님.
        while len(nodes) > 1:
            if nodes.pop() != nodes.popleft():
                return False

        return True


print(Solution.isPalindrome(None, ListNode(1, ListNode(2))))
print(Solution.isPalindrome(None, ListNode(1, ListNode(2, ListNode(2, ListNode(1))))))
