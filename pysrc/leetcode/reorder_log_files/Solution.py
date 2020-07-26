from typing import List


class Solution:
    def reorderLogFiles(self, logs: List[str]) -> List[str]:
        # 문자로그 추출
        letter_logs = [log for log in logs if not log.split()[1].isdigit()]
        # 문자로그 정렬 (사전식)
        letter_logs.sort(key=lambda x: (x.split()[1:], x.split()[0]))
        return letter_logs + [log for log in logs if log.split()[1].isdigit()]  # 문자로그와 숫자로그 합치기


print(Solution.reorderLogFiles(None, ["dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"]))
