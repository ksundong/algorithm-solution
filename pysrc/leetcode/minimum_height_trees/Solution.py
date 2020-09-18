import collections
from typing import List


# 모든 경우를 다 만들어봐야 하는걸까?
class Solution:  # 제약 조건은 2만개 간선은 19999개까지 가능
    def findMinHeightTrees(self, n: int, edges: List[List[int]]) -> List[int]:
        # {높이, 리스트}
        answer = collections.defaultdict(list)
        min_height = 99999

        # 해당 노드를 루트노드로 하는 그래프의 높이 구하기
        def get_height(node, visited):
            for x, y in edges:
                if (x, y) in visited:
                    continue
                if x == node or y == node:
                    visited.append((x, y))
                if x == node:
                    return get_height(y, visited) + 1
                if y == node:
                    return get_height(x, visited) + 1
            return 0

        # 노드는 0부터 n까지
        for i in range(n):  # 모든 노드를 루트노드로 두고 높이를 구한다.
            h = get_height(i, [])
            # 높이를 key로 해서 저장
            answer[h].append(i)
            # 높이 비교 후 min_height 저장
            min_height = min(h, min_height)

        return answer[min_height]
