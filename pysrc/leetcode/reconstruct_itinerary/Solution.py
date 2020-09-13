import collections
from typing import List


class Solution:
    def findItinerary(self, tickets: List[List[str]]) -> List[str]:
        # 사전에 그래프를 구성
        graph = collections.defaultdict(list)
        for f, t in sorted(tickets, reverse=True):
            graph[f].append(t)

        answer = []

        def dfs(a):
            while graph[a]:
                dfs(graph[a].pop())
            answer.append(a)

        dfs('JFK')

        return answer[::-1]


solution = Solution()
print(solution.findItinerary([["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]]))
print(solution.findItinerary([["JFK", "SFO"], ["JFK", "ATL"], ["SFO", "ATL"], ["ATL", "JFK"], ["ATL", "SFO"]]))
