# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def isPalindrome(self, head: ListNode) -> bool:
        rev = None
        slow = fast = head
        # 런너를 이용해 역순 연결리스트 구성
        while fast and fast.next:  # 두 칸씩 건너뛰기 위해 확인
            fast = fast.next.next  # 두 칸씩 건너뛴다.
            rev, rev.next, slow = slow, rev, slow.next  # rev는 역순으로 노드를 저장한다.
        if fast:  # 홀수개라면
            slow = slow.next  # 가운데 노드는 건너간다.

        # 팰린드롬 여부 확인
        while rev and rev.val == slow.val:
            slow, rev = slow.next, rev.next
        return not rev  # rev가 존재하면 값이 다른경우다.


print(Solution.isPalindrome(None, ListNode(1, ListNode(2))))
print(Solution.isPalindrome(None, ListNode(1, ListNode(2, ListNode(2, ListNode(1))))))
