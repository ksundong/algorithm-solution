from typing import List


class Solution:
    def reverseString(self, s: List[str]) -> None:
        # Pythonic way 2 슬라이싱 활용하기(문자열에도 사용가능)
        s[:] = s[::-1]  # s = s[::-1] 은 동작안해서 사용하는 트릭
