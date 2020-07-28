# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        if None in (l1, l2):  # 둘 중 하나가 없으면, 바로 나머지를 반환한다.
            return l1 or l2
        l3 = cur = ListNode(0)  # 더미노드 선언 l3는 머리, cur는 현재 노드

        while l1 and l2:  # l1과 l2가 둘 다 존재하는 동안...
            if l1.val < l2.val:
                cur.next = l1
                l1 = l1.next
            else:
                cur.next = l2
                l2 = l2.next
            cur = cur.next

        cur.next = l1 or l2  # 남은 것을 붙여준다.
        return l3.next  # 더미노드를 제외한 노드를 반환한다.


print(Solution.mergeTwoLists(None, ListNode(1, ListNode(2, ListNode(4))), ListNode(1, ListNode(3, ListNode(4)))))
print(Solution.mergeTwoLists(None, ListNode(), ListNode(0)))
