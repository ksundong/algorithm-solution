from collections import Counter


def solution(N, stages):
    answer = []
    tot = len(stages)
    stage_counter = Counter(stages)

    for i in range(1, N + 1):
        try:
            answer.append((stage_counter[i] / tot, i))
            tot -= stage_counter[i]
        except ZeroDivisionError:  # 이미 다 돌았을 경우 tot이 0이되면서 ZeroDivisionError 발생(실패율 0 으로 계산)
            answer.append((0, i))

    return [res for _, res in sorted(answer, key=lambda x: (-x[0], x[1]))]
