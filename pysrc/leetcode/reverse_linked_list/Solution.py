# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        def reverse(node: ListNode, prev: ListNode = None):
            if not node:  # 종료조건, 노드가 존재하지 않는다면 끝낸다.
                return prev
            next_node, node.next = node.next, prev  # 다음 노드 참조에 현재 노드의 다음 노드 참조를 넣고, 다음 노드 참조에 이전 노드를 넣는다.
            return reverse(next_node, node)  # 재귀 구간(다음 노드에, 이전노드인 현재 노드를 넣는 과정)

        return reverse(head)


print(Solution.reverseList(None, ListNode(1, ListNode(2, ListNode(3)))))
