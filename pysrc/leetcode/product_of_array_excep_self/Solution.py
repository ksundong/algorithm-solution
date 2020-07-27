from typing import List


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = []
        p = 1
        # 왼쪽 부터 곱셈
        for i in range(len(nums)):
            result.append(p)
            p *= nums[i]
        p = 1
        # 왼쪽결과에 오른쪽 값 부터 곱셈
        for i in range(len(nums) - 1, -1, -1):
            result[i] *= p
            p *= nums[i]
        return result


print(Solution.productExceptSelf(None, [1, 2, 3, 4]))
