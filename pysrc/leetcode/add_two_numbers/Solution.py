# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        dummy = cur = ListNode(0)

        carry = 0  # carry out될 변수 선언
        while l1 or l2 or carry:  # l1, l2, carry 중 하나라도 존재하는 경우
            sum_of_num = 0  # 합
            if l1:
                sum_of_num += l1.val
                l1 = l1.next
            if l2:
                sum_of_num += l2.val
                l2 = l2.next

            carry, sum_of_num = divmod(sum_of_num + carry, 10)  # 자리 올림수, 나머지 계산
            cur.next = ListNode(sum_of_num)
            cur = cur.next

        return dummy.next


Solution.addTwoNumbers(None, ListNode(9, ListNode(8)), ListNode(1))
Solution.addTwoNumbers(None, ListNode(5), ListNode(5))
Solution.addTwoNumbers(None, ListNode(1, ListNode(8)), ListNode(0))
Solution.addTwoNumbers(None, ListNode(2, ListNode(4, ListNode(5))), ListNode(5, ListNode(6, ListNode(4))))
Solution.addTwoNumbers(None, ListNode(2, ListNode(4, ListNode(3))), ListNode(5, ListNode(6, ListNode(4))))
