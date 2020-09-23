import heapq
from typing import List


class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        heap = []
        for num in nums:
            heapq.heappush(heap, -num)

        answer = 0
        for i in range(k):
            answer = -heapq.heappop(heap)

        return answer
