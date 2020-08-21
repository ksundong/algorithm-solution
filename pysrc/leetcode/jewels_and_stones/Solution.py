class Solution:
    def numJewelsInStones(self, J: str, S: str) -> int:
        return sum(s in J for s in S)


solution: Solution = Solution()
print(solution.numJewelsInStones('aA', 'aAAbbbb'))  # 3
print(solution.numJewelsInStones('z', 'ZZ'))  # 0
