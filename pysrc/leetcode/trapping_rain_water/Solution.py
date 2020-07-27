from typing import List


class Solution:
    def trap(self, height: List[int]) -> int:
        left, right = 0, len(height) - 1
        max_left, max_right = 0, 0  # 최대 높이를 저장할 변수선언
        result = 0
        while left < right:
            if max_left < height[left]:
                max_left = height[left]
            else:
                result += max_left - height[left]
            if max_right < height[right]:
                max_right = height[right]
            else:
                result += max_right - height[right]

            left += 1
            right -= 1
            print(result, left, right, max_left, max_right)
        return result


print(Solution.trap(None, [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]))
