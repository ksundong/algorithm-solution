from typing import List


class Solution:
    def reverseString(self, s: List[str]) -> None:
        # 왼쪽과 오른쪽 포인터 지정
        left, right = 0, len(s) - 1
        while left < right:
            # 이 부분을 보고 되게 신기했는데, 별도의 tmp 변수가 없어도 된다.
            s[left], s[right] = s[right], s[left]
            left += 1
            right -= 1
