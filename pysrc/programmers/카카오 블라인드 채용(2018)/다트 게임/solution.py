import re


def solution(dartResult):
    s_dict = {'S': 1, 'D': 2, 'T': 3}
    option = {'': 1, '*': 2, '#': -1}

    pattern = re.compile(r'(\d+)([SDT])([*#]?)')
    dart = pattern.findall(dartResult)
    for i in range(len(dart)):
        if i > 0 and dart[i][2] == '*':
            dart[i - 1] *= 2
        dart[i] = int(dart[i][0]) ** s_dict[dart[i][1]] * option[dart[i][2]]

    return sum(dart)


solution('1D2S#10S')
