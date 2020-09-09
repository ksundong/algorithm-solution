def solution(s: str):
    one_count = 0  # 1로 바꾸는데 필요한 횟수
    zero_count = 0  # 0으로 바꾸는 필요한 횟수

    if s[0] == '0':
        one_count += 1
    else:
        zero_count += 1

    for i in range(1, len(s)):
        if s[i - 1] != s[i]:  # 다르면
            if s[i] == '0':
                one_count += 1
            else:
                zero_count += 1

    return min(one_count, zero_count)


print(solution('0001100'))
print(solution('1001100'))
print(solution('1001101'))
