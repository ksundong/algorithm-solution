from typing import List


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_profit: int = 0
        for i in range(len(prices) - 1):
            max_profit = max(max_profit, max(prices[i + 1:]) - prices[i])
        return max_profit

print(Solution.maxProfit(None, [7, 1, 5, 3, 6, 4]))
print(Solution.maxProfit(None, [7, 6, 4, 3, 1]))
