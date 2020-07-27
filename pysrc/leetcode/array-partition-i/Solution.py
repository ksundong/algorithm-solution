from typing import List


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        sum_of_nums: int = 0
        for num in nums[::2]:
            sum_of_nums += num
        return sum_of_nums


print(Solution.arrayPairSum(None, [1, 4, 3, 2]))
