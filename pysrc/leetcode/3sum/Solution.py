from typing import List


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        for i, num in enumerate(nums):  # 기본 값 하나를 지정하고 시작
            h = {}
            nums_slice = nums[i + 1:]
            for num2 in nums_slice:  # 선택된 값을 제외한 배열 슬라이싱(합이 -num이면 된다.)
                if num2 in h and num != num2:  # 이 값이 이미 저장되어 있다면
                    result.append([num, num2, num - num2])
                else:
                    h[num - num2] = True

        return result



print(Solution.threeSum(None, [-1, 0, 1, 2, -1, -4]))
