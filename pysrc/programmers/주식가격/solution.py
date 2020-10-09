def solution(prices):
    answer = [0] * len(prices)

    # 스택에는 항상 작은 인덱스가 먼저 저장됨
    stack = []
    for i, p in enumerate(prices):
        # 스택에 존재하는 가장 마지막 인덱스가 p보다 작거나 스택이 빌 때까지
        while stack and prices[stack[-1]] > p:
            # answer에 현재 인덱스 - 마지막 인덱스 뺀 값이 떨어지지 않은 시간
            answer[stack[-1]] = i - stack[-1]
            stack.pop(-1)

        stack.append(i)

    # 스택에 데이터가 남아있다면
    while stack:
        # 마지막 인덱스에서 뺀 값을 저장
        answer[stack[-1]] = (len(prices) - 1) - stack[-1]
        stack.pop(-1)

    return answer
