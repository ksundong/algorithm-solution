def solution(s):
    # 절반까지만 탐색하면 됨
    repeat = len(s) // 2
    answer = len(s)

    # 자를 문자 수
    for i in range(1, repeat + 1):
        compact = ''
        count = 1
        before_str = s[0:i]

        # 잘라서 실제 연산하는 부분
        for j in range(i, len(s) + i, i):
            current_str = s[j: j + i]

            # count가 2이상이면 붙인다.
            if current_str != before_str:
                compact += before_str if count < 2 else str(count) + before_str
                before_str = current_str
                count = 0
            count += 1

        answer = min(answer, len(compact))

    return answer
