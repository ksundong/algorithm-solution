import collections
from typing import List


class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        # 전처리
        graph = collections.defaultdict(list)
        for x, y in prerequisites:
            graph[x].append(y)

        return True


solution = Solution()
solution.canFinish(2, [[1, 0]])  # True
solution.canFinish(2, [[1, 0], [0, 1]])  # False
