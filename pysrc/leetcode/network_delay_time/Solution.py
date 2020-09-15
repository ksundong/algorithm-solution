import heapq
from typing import List


class Solution:
    def networkDelayTime(self, times: List[List[int]], N: int, K: int) -> int:
        graph = [[] for _ in range(N + 1)]
        distance = [float('inf')] * (N + 1)
        # 전처리
        for start, end, time in times:
            graph[start].append((end, time))

        self.dijkstra(K, graph, distance)
        print(distance)

        if float('inf') in distance[1:]:
            return -1
        return max(distance[1:])

    # 최단거리 알고리즘
    def dijkstra(self, start: int, graph: list, distance: list):
        q = []
        # 시작노드는 최단 경로가 0
        heapq.heappush(q, (0, start))
        distance[start] = 0
        while q:  # 큐가 비어있지 않다면
            dist, now = heapq.heappop(q)

            if distance[now] < dist:
                continue

            for b, c in graph[now]:
                cost = dist + c
                if cost < distance[b]:
                    distance[b] = cost
                    heapq.heappush(q, (cost, b))

solution = Solution()
solution.networkDelayTime([[2, 1, 1], [2, 3, 1], [3, 4, 1]], 4, 2)  # 2
