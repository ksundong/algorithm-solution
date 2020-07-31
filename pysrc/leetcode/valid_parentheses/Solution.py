class Solution:
    def isValid(self, s: str) -> bool:
        pass


solution = Solution()
print(solution.isValid("()"))
print(solution.isValid("()[]{}"))
print(solution.isValid("(])"))
print(solution.isValid("([)])"))
print(solution.isValid("{[]})"))
