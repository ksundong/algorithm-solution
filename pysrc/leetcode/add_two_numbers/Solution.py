# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        dummy = cur = ListNode(0)

        quotient = 0  # 몫을 저장할 변수 선언
        while l1 and l2:  # l1과 l2가
            remainer = (l1.val + l2.val + quotient) % 10  # 나머지 계산, 몫도 포함해서 계산한다.
            quotient = (l1.val + l2.val + quotient) // 10  # 몫 계산, 혹시 자리올림이 발생할 수 있으므로 몫도 더해서 계산한다.
            cur.next = ListNode(remainer)  # 나머지 부분만 저장한다.
            l1, l2, cur = l1.next, l2.next, cur.next  # 다음노드 참조

        # 길이가 다른 경우
        if l1:
            while l1:
                remainer = (l1.val + quotient) % 10  # 나머지 계산, 몫도 포함해서 계산한다.
                quotient = (l1.val + quotient) // 10  # 몫 계산, 혹시 자리올림이 발생할 수 있으므로 몫도 더해서 계산한다.
                cur.next = ListNode(remainer)  # 나머지 부분만 저장한다.
                l1, cur = l1.next, cur.next
        if l2:
            while l2:
                remainer = (l2.val + quotient) % 10  # 나머지 계산, 몫도 포함해서 계산한다.
                quotient = (l2.val + quotient) // 10  # 몫 계산, 혹시 자리올림이 발생할 수 있으므로 몫도 더해서 계산한다.
                cur.next = ListNode(remainer)  # 나머지 부분만 저장한다.
                l2, cur = l2.next, cur.next

        # 몫이 남은 경우
        if quotient != 0:
            cur.next = ListNode(quotient)

        return dummy.next


Solution.addTwoNumbers(None, ListNode(9, ListNode(8)), ListNode(1))
Solution.addTwoNumbers(None, ListNode(5), ListNode(5))
Solution.addTwoNumbers(None, ListNode(1, ListNode(8)), ListNode(0))
Solution.addTwoNumbers(None, ListNode(2, ListNode(4, ListNode(5))), ListNode(5, ListNode(6, ListNode(4))))
Solution.addTwoNumbers(None, ListNode(2, ListNode(4, ListNode(3))), ListNode(5, ListNode(6, ListNode(4))))
