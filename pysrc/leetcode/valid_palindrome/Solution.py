import re


class Solution:
    def isPalindrome(self, s: str) -> bool:
        # 소문자로 변경
        s = s.lower()
        # 정규표현식을 이용해서 필터링
        s = re.sub('[^a-z0-9]', '', s)

        return s == s[::-1]  # 거꾸로 뒤집어서 비교(슬라이싱 활용)
