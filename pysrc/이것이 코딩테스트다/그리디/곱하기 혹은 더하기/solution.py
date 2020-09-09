def solution(s: str):
    result = int(s[0])

    for i in range(1, len(s)):
        num = int(s[i])
        if num < 2 or result < 2:
            result += num
        else:
            result *= num

    return result


print(solution('02984'))  # 576
print(solution('567'))  # 210
