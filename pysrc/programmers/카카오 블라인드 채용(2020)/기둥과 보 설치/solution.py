# build_frame: [x, y / a / b] (좌표, 종류(0 기둥, 1 보), 1 설치/0 삭제)
# answer: [x, y / a] (좌표, 종류(0 기둥, 1 보)
def possible(answer):
    for x, y, a in answer:
        if a == 0:  # 기둥
            # 바닥 위, 보의 한 쪽 끝부분 위, 다른 기둥 위
            if y == 0 or [x - 1, y, 1] in answer or [x, y, 1] in answer or [x, y - 1, 0] in answer:
                continue
            return False
        elif a == 1:  # 보
            # 한 쪽 끝이 기둥 위, 양쪽 끝이 다른 보와 연결
            if [x, y - 1, 0] in answer or [x + 1, y - 1, 0] in answer or ([x - 1, y, 1]
                                                                          in answer and [x + 1, y, 1] in answer):
                continue
            return False
    return True


def solution(n, build_frame):
    answer = []

    for x, y, a, b in build_frame:
        if b == 0:  # 삭제
            answer.remove([x, y, a])
            if not possible(answer):
                answer.append([x, y, a])
        if b == 1:  # 설치
            answer.append([x, y, a])
            if not possible(answer):
                answer.remove([x, y, a])
        print(answer)
    return sorted(answer)


solution(5, [[1, 0, 0, 1], [1, 1, 1, 1], [2, 1, 0, 1], [2, 2, 1, 1], [5, 0, 0, 1], [5, 1, 0, 1], [4, 2, 1, 1],
             [3, 2, 1, 1]])
