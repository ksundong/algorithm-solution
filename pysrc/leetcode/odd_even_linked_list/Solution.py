# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def oddEvenList(self, head: ListNode) -> ListNode:
        if not head:  # edge case가 있어서 작성
            return head

        prev, even = head, head.next
        while even and even.next:  # 마지막 노드가 None 값을 가질 경우 탈출 or even 다음 노드가 존재해야 함.
            odd = even.next  # 끝까지 다 갔을 경우엔 even.next가 존재하지 않으므로 앞에서 선언해준다.
            prev.next, odd.next, even.next = odd, prev.next, odd.next  # 각각의 값을 한 번에 다중할당 해준다.

            even, prev = even.next, prev.next  # 다음 값을 할당해준다.
        return head


solution: Solution = Solution()
solution.oddEvenList(
    ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5, ListNode(6, ListNode(7, ListNode(8)))))))))

solution: Solution = Solution()
solution.oddEvenList(ListNode(2, ListNode(1, ListNode(3, ListNode(5, ListNode(6, ListNode(4, ListNode(7, None))))))))

solution: Solution = Solution()
solution.oddEvenList(ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5, None))))))
