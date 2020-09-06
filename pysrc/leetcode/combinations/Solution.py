from typing import List


class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        results = []

        def dfs(elements, start: int, limit: int):
            # 원하는 크기에 도달하면 결과에 추가
            if limit == 0:
                results.append(elements[:])
                return

            # 자신 이전의 모든 값을 고정하여 재귀 호출
            for i in range(start, n + 1):
                elements.append(i)
                dfs(elements, i + 1, limit - 1)
                elements.pop()

        dfs([], 1, k)
        return results


solution = Solution()
print(solution.combine(5, 3))
