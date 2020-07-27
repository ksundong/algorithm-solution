from typing import List


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = []
        for i in range(len(nums)):
            tmp: int = 1
            for j, num in enumerate(nums):
                if i != j:
                    tmp *= num

            result.append(tmp)
        return result


print(Solution.productExceptSelf(None, [1, 2, 3, 4]))
