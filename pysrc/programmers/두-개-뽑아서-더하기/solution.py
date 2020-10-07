from itertools import combinations


def solution(numbers):
    return sorted(list(set([sum(x) for x in combinations(numbers, 2)])))
