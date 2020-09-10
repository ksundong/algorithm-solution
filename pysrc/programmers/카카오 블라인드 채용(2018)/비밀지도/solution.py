def solution(n, arr1, arr2):
    answer = []

    for a, b in zip(arr1, arr2):
        answer.append(format((a | b), '0' + str(n) + 'b').replace('1', '#').replace('0', ' '))
    return answer
