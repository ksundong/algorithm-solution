import heapq
from typing import List


class Solution:
    def findCheapestPrice(self, n: int, flights: List[List[int]], src: int, dst: int, K: int) -> int:
        graph = [[] for _ in range(n)]
        # 전처리
        for u, v, w in flights:
            graph[u].append((v, w))

        q = [(0, src, 0)]

        while q:  # 큐가 비어있지 않다면
            dist, now, k = heapq.heappop(q)

            if now == dst:
                return dist

            if k <= K:  # 경유지 개수 이내라면
                k += 1
                for b, c in graph[now]:
                    cost = dist + c
                    heapq.heappush(q, (cost, b, k))
        return -1


solution = Solution()
# solution.findCheapestPrice(3, [[0, 1, 100], [1, 2, 100], [0, 2, 500]], 0, 2, 1)
solution.findCheapestPrice(4, [[0, 1, 1], [0, 2, 5], [1, 2, 1], [2, 3, 1]], 0, 3, 1)
