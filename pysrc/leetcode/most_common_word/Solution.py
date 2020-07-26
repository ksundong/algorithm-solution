import re
from collections import Counter
from typing import List


class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        # 정규식 앞에 r을 붙이는 이유는 이스케이핑이 제대로 되도록 하기 위함이다.
        # 문장부호는 무시되는 것이 아니라 구분자로 쓰인다.
        # not in 을 쓰면 속하지 않는 것만 True 값이 된다.
        # [0][0]을 쓰는 이유는 가장 첫번째 인덱스의 개수가 아닌 key를 가져오기 위함이다.
        return Counter([word for word in re.sub(r'[^\w]', ' ', paragraph.lower()).split()
                        if word not in banned]).most_common(1)[0][0]


print(Solution.mostCommonWord(None, 'Bob hit a ball, the hit BALL flew far after it was hit.', ['hit']))
print(Solution.mostCommonWord(None, 'a, a, a, a, b,b,b,c, c', ['a']))
