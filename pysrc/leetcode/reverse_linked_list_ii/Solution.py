# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverseBetween(self, head: ListNode, m: int, n: int) -> ListNode:
        if not head.next:  # edge case 처리(노드가 하나라면 그냥 그대로 나간다.
            return head

        cnt: int = 1  # index 기반이 아닌 위치기반이라 1부터 시작
        prev, node = None, head  # 시작 값 설정
        while cnt < m:  # m까지 cnt 값을 증가시키며 노드를 순차적으로 할당
            prev, node = node, node.next
            cnt += 1

        while cnt < n:  # n까지 cnt 값을 증가시키며 노드를 역순정렬
            next_node = node.next
            if prev:  # head가 바뀌지 않는 경우
                prev.next, node.next, next_node.next = next_node, next_node.next, prev.next
            else:  # head부터 바뀌어야 하는 경우
                head, next_node.next, node.next = next_node, head, next_node.next
            cnt += 1

        return head


solution: Solution = Solution()
solution.reverseBetween(ListNode(1, ListNode(2, ListNode(3, None))), 1, 3)

solution: Solution = Solution()
solution.reverseBetween(ListNode(3, ListNode(5, None)), 1, 2)

solution: Solution = Solution()
solution.reverseBetween(ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5, None))))), 2, 4)
