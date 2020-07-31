from typing import List


class Solution:
    def dailyTemperatures(self, T: List[int]) -> List[int]:
        stack = []
        for i, temp in enumerate(T):  # 인덱스 선언을 겸함
            if not stack:  # 스택이 비어있는 경우
                stack.append((i, temp))
            elif stack[-1][1] >= temp:  # 스택의 맨 위의 온도가 더 큰 경우
                stack.append((i, temp))
            else:
                while stack and stack[-1][1] < temp:  # 스택이 비어있지 않고, 스택의 맨위 온도보다 현재 온도가 더 커질 때 까지
                    pop_index = stack.pop()[0]
                    T[pop_index] = i - pop_index  # 인덱스 만큼의 차이를 저장(몇 일)
                stack.append((i, temp))  # 비교 대상이었던 대상을 저장

        while stack:  # 스택이 빌때까지
            T[stack.pop()[0]] = 0  # 0으로 채운다.
        return T


solution = Solution()
print(solution.dailyTemperatures([73, 74, 75, 71, 69, 72, 76, 73]))
