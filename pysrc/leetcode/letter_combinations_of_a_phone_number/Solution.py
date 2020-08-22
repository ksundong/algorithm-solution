from typing import List


class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        char_dict = {'2': 'abc', '3': 'def', '4': 'ghi', '5': 'jkl', '6': 'mno', '7': 'pqrs', '8': 'tuv', '9': 'wxyz'}

        combinations = [''] if digits else []  # 조합을 담을 리스트
        for d in digits:
            combinations = [p + q for p in combinations for q in char_dict[d]]  # 이미 있던걸 먼저 넣고 그 다음을 추가
        return combinations


solution: Solution = Solution()
print(solution.letterCombinations('23'))
print(solution.letterCombinations('234'))
print(solution.letterCombinations('27'))
