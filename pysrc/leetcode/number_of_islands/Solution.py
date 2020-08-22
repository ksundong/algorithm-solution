from typing import List


class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        discovered: int = 0
        # 먼저 모든 요소에서 다 탐색을 해야할 것 같다.
        for (i, row) in enumerate(grid):
            for j in range(len(row)):
                # 육지면 dfs를 수행한다.(물이나올때까지)
                if grid[i][j] == '1':
                    self.dfs(grid, i, j)
                    discovered += 1

        return discovered

    def dfs(self, grid, i, j):
        # 더 이상 육지가 아니면 종료
        out_of_range: bool = i < 0 or i >= len(grid) or j < 0 or j >= len(grid[i])
        if out_of_range or grid[i][j] != '1':
            return

        grid[i][j] = 'd'  # 방문 표시

        # 사방으로 탐색
        self.dfs(grid, i - 1, j)
        self.dfs(grid, i + 1, j)
        self.dfs(grid, i, j - 1)
        self.dfs(grid, i, j + 1)


solution: Solution = Solution()
print(solution.numIslands([['1', '1', '1', '1', '0'],
                           ['1', '1', '0', '1', '0'],
                           ['1', '1', '0', '0', '0'],
                           ['0', '0', '0', '0', '0']]))  # 1
print(solution.numIslands([['1', '1', '0', '0', '0'],
                           ['1', '1', '0', '0', '0'],
                           ['0', '0', '1', '0', '0'],
                           ['0', '0', '0', '1', '1']]))  # 3
