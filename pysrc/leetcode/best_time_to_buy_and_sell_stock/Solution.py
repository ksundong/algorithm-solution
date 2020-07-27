import sys
from typing import List


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_profit: int = 0  # 최소 0이다.
        min_price: int = sys.maxsize  # 항상 갱신될 수 있도록 한다.
        for price in prices:  # 최대 이익과 최소 가격을 계속 갱신한다.
            min_price = min(min_price, price)
            max_profit = max(max_profit, price - min_price)
        return max_profit


print(Solution.maxProfit(None, [7, 1, 5, 3, 6, 4]))
print(Solution.maxProfit(None, [7, 6, 4, 3, 1]))
