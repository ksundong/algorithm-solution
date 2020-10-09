# 3진법에 기초한다.
def solution(n):
    answer = ''
    # 나머지가 0인경우 1, 1인경우 2, 2인경우 4이다.
    one_two_four = ['1', '2', '4']

    while n > 0:
        n -= 1  # 1씩 빼주는 것이 핵심
        answer = one_two_four[n % 3] + answer  # 뒤에 붙여야한다.
        n //= 3  # 3진법과 유사하므로 3으로 나눠준다.

    return answer
