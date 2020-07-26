from typing import List


class Solution:
    def reverseString(self, s: List[str]) -> None:
        length: int = len(s)  # 여러번 사용되는 값 변수로 추출
        for i in range(length // 2):  # 중간지점까지 요소를 바꾼다.
            tmp = s[i]  # 값을 저장할 임시 공간
            reversed_i = length - i - 1
            s[i] = s[reversed_i]
            s[reversed_i] = tmp
