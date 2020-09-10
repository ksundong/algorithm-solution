def solution(numbers, hand):
    answer = ''
    left = {1, 4, 7}
    right = {3, 6, 9}
    left_pos = (3, 0)
    right_pos = (3, 2)

    for number in numbers:
        if number in left:
            answer += 'L'
            left_pos = ((number - 1) // 3, 0)
        elif number in right:
            answer += 'R'
            right_pos = ((number - 3) // 3, 2)
        else:
            if number == 0:
                number = 11
            num_pos = ((number - 2) // 3, 1)
            # 거리 측정
            left_dist = abs(left_pos[0] - num_pos[0]) + abs(left_pos[1] - num_pos[1])
            right_dist = abs(right_pos[0] - num_pos[0]) + abs(right_pos[1] - num_pos[1])

            if left_dist < right_dist:
                answer += 'L'
                left_pos = num_pos
            elif left_dist > right_dist:
                answer += 'R'
                right_pos = num_pos
            # 거리가 같다면 왼손잡이, 오른손잡이
            else:
                if hand == 'left':
                    answer += 'L'
                    left_pos = num_pos
                else:
                    answer += 'R'
                    right_pos = num_pos

    return answer
