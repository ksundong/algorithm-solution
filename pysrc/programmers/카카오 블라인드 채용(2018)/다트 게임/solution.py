import re


def solution(dartResult):
    s_dict = {'S': 1, 'D': 2, 'T': 3}
    scores = [0] * 3

    match = re.finditer(r'(\d+[SDT][*#]?)', dartResult)
    for j, m in enumerate(match):
        match2 = re.match(r'(\d+)([SDT]+)([*#]?)', m.group())
        for i, m2 in enumerate(match2.groups()):
            if i == 0:  # 숫자
                scores[j] = int(m2)
            if i == 1:  # SDT
                scores[j] **= s_dict[m2]
            if i == 2:  # 옵션
                if m2 == '*':
                    if j > 0:
                        scores[j - 1] *= 2
                    scores[j] *= 2
                if m2 == '#':
                    scores[j] *= -1

    return sum(scores)


solution('1D2S#10S')
