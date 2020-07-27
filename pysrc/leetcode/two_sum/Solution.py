from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # 나온 숫자와 인덱스를 저장하는 딕셔너리 선언
        dictionary = {}
        for i, num in enumerate(nums):
            sub = target - num
            if sub not in dictionary:
                dictionary[num] = i
            else:
                return [dictionary[sub], i]


print(Solution.twoSum(None, [2, 7, 11, 15], 9))
print(Solution.twoSum(None, [3, 2, 4], 6))
