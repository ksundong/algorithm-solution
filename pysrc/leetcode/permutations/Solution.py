from itertools import permutations
from typing import List


class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        return list(permutations(nums))


solution = Solution()
solution.permute([1, 2, 3])
