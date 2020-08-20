import heapq
from typing import List


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def mergeKLists(self, lists: List[ListNode]) -> ListNode:
        root = result = ListNode(None)
        heap = []

        # 각 연결 리스트의 루트를 힙에 저장
        for i in range(len(lists)):
            if lists[i]:
                heapq.heappush(heap, (lists[i].val, i, lists[i]))  # 왜 튜플로 저장하지? (중복방지)

        # 힙 추출 이후 다음 노드는 다시 저장
        while heap:
            node = heapq.heappop(heap)
            i = node[1]  # 튜플의 i
            result.next = node[2]  # 튜플에 저장한 리스트를 붙인다.

            result = result.next  # 이미 정렬된 부분은 다음으로 넘어간다.
            if result.next:  # 리스트 다음이 존재하면 리스트를 다시 힙에 넣는다
                heapq.heappush(heap, (result.next.val, i, result.next))

        return root.next


lists = [ListNode(1, ListNode(4, ListNode(5))), ListNode(1, ListNode(3, ListNode(4))), ListNode(2, ListNode(6))]

solution = Solution()
solution.mergeKLists(lists)
