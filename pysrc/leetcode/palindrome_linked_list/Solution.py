# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def isPalindrome(self, head: ListNode) -> bool:
        pass


print(Solution.isPalindrome(None, ListNode(1, ListNode(2))))
print(Solution.isPalindrome(None, ListNode(1, ListNode(2, ListNode(2, ListNode(1))))))
