from typing import List


def solution(adventurers: List):
    adventurers.sort()

    result = 0
    count = 0

    for i in adventurers:
        count += 1
        if count >= i:
            result += 1
            count = 0

    return result


print(solution([2, 3, 1, 2, 2]))  # 2
print(solution([5, 1, 1, 1, 1]))  # 4
print(solution([5, 4, 3, 2, 1]))  # 1
