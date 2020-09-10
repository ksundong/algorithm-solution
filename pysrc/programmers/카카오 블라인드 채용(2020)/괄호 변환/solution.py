def solution(p):
    answer = ''
    if p == '':
        return p

    index = balanced_index(p)
    # 균형잡힌 괄호 문자열 인덱스 반환하기
    # 3
    u = p[:index + 1]
    v = p[index + 1:]

    # 3-1
    if check_correct(u):
        answer = u + solution(v)
    else:
        # 4-1
        answer += '('
        # 4-2
        answer += solution(v)
        # 4-3
        answer += ')'

        # 4-4
        u = list(u[1:-1])
        for i in range(len(u)):
            u[i] = ')' if u[i] == '(' else '('

        # 4-5
        answer += ''.join(u)

    return answer


def balanced_index(string):
    count = 0
    for i in range(len(string)):
        if string[i] == '(':
            count += 1
        else:
            count -= 1
        if count == 0:
            return i


def check_correct(string):
    s_count = 0
    for char in string:
        if char == '(':
            s_count += 1
        else:
            if s_count == 0:
                return False
            s_count -= 1

    return s_count == 0
