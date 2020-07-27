from typing import List


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        return sum(sorted(nums)[::2])


print(Solution.arrayPairSum(None, [1, 4, 3, 2]))
