from collections import Counter
from typing import List


class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        result = []
        for t in Counter(nums).most_common(k):
            result.append(t[0])
        return result


solution: Solution = Solution()
print(solution.topKFrequent([1, 2], 2))
print(solution.topKFrequent([1, 1, 1, 2, 2, 3], 2))
print(solution.topKFrequent([1], 1))
