from typing import List


class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        pass


solution: Solution = Solution()
print(solution.numIslands([['1', '1', '1', '1', '0'],
                           ['1', '1', '0', '1', '0'],
                           ['1', '1', '0', '0', '0'],
                           ['0', '0', '0', '0', '0']]))  # 1
print(solution.numIslands([['1', '1', '0', '0', '0'],
                           ['1', '1', '0', '0', '0'],
                           ['0', '0', '1', '0', '0'],
                           ['0', '0', '0', '1', '1']]))  # 3
