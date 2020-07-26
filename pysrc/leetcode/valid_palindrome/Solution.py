import re
from collections import Counter


class Solution:
    def isPalindrome(self, s: str) -> bool:
        if s == '':
            return True
        s = s.lower()
        s = re.sub('[^a-z0-9]', '', s)
        print()
        if len(s) % 2 == 0:
            for k, v in Counter(s).items():
                if v % 2 != 0:
                    return False
        else:
            is_first_odd: bool = False
            for k, v in Counter(s).items():
                if v % 2 != 0 and is_first_odd:
                    return False
                elif v % 2 != 0:
                    is_first_odd = True
        return True




print(Solution.isPalindrome(None, "A man, a plan, a canal: Panama"))
