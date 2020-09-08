from typing import List


class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        answer = []

        def dfs(elements, start: int):
            # 원하는 크기에 도달하면 결과에 추가
            answer.append(elements)

            # 자신 이전의 모든 값을 고정하여 재귀 호출
            for i in range(start, len(nums)):
                dfs(elements + [nums[i]], i + 1)

        # 0개 부터 n개 까지
        dfs([], 0)

        return answer


solution = Solution()
print(solution.subsets([1, 2, 3]))
