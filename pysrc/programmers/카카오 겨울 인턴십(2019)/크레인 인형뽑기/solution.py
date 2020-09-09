# before와 current가 동일할 때 사라지는 것은 두 개
def solution(board, moves):
    answer = 0
    before = []
    n = len(board)

    for move in moves:
        for i in range(n):
            b = board[i][move - 1]
            if b != 0:
                before.append(b)
                board[i][move - 1] = 0
                break

        if len(before) > 1 and before[-2] == before[-1]:
            answer += 2
            before.pop(-1)
            before.pop(-1)

    return answer
