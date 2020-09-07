from typing import List


# 중복조합이므로 모든 경우를 다 시도해봐야 한다.
class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        result = []

        def comb(elements: List[int], start: int, limit: int):
            if limit < 0:
                return
            if limit == 0:
                result.append(elements[:])

            for cand in candidates[start:]:
                elements.append(cand)
                comb(elements, start, limit - cand)
                elements.pop()
                start += 1

        comb([], 0, target)
        return result


solution = Solution()
print(solution.combinationSum([2, 3, 6, 7], 7))
print(solution.combinationSum([2, 3, 5], 8))
