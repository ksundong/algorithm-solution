import re
from collections import Counter


def solution(s):
    num_count = Counter(map(int, re.findall(r'\d+', s)))

    return [x for x, _ in num_count.most_common()]


print(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"))
