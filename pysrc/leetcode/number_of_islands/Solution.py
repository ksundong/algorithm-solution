from typing import List


class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        def dfs(m, n):
            # 더 이상 육지가 아니면 종료
            out_of_range: bool = m < 0 or m >= len(grid) or n < 0 or n >= len(grid[m])
            if out_of_range or grid[m][n] != '1':
                return

            grid[m][n] = 'd'  # 방문 표시

            # 사방으로 탐색
            dfs(m - 1, n)
            dfs(m + 1, n)
            dfs(m, n - 1)
            dfs(m, n + 1)

        discovered: int = 0
        # 먼저 모든 요소에서 다 탐색을 해야할 것 같다.
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                # 육지면 dfs를 수행한다.(물이나올때까지)
                if grid[i][j] == '1':
                    dfs(i, j)
                    discovered += 1

        return discovered


solution: Solution = Solution()
print(solution.numIslands([['1', '1', '1', '1', '0'],
                           ['1', '1', '0', '1', '0'],
                           ['1', '1', '0', '0', '0'],
                           ['0', '0', '0', '0', '0']]))  # 1
print(solution.numIslands([['1', '1', '0', '0', '0'],
                           ['1', '1', '0', '0', '0'],
                           ['0', '0', '1', '0', '0'],
                           ['0', '0', '0', '1', '1']]))  # 3
