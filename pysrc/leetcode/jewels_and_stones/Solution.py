from collections import Counter


class Solution:
    def numJewelsInStones(self, J: str, S: str) -> int:
        stone_count: Counter = Counter(S)
        count: int = 0
        for j in J:
            count += stone_count[j]
        return count


solution: Solution = Solution()
print(solution.numJewelsInStones('aA', 'aAAbbbb'))  # 3
print(solution.numJewelsInStones('z', 'ZZ'))  # 0
