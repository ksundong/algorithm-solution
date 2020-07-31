class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        char_table = {')': '(', ']': '[', '}': '{'}  # 닫는 괄호에 여는 괄호 매핑
        for char in s:
            if char not in char_table:  # 요구사항을 보면 괄호 종류만 들어옴
                stack.append(char)
            elif not stack or char_table[char] != stack.pop():  # 스택이 비었을 때, 오류가 발생하므로 예외처리
                return False
        return len(stack) == 0


solution = Solution()
print(solution.isValid("()"))
print(solution.isValid("()[]{}"))
print(solution.isValid("(])"))
print(solution.isValid("([)])"))
print(solution.isValid("{[]}"))
print(solution.isValid("["))
print(solution.isValid("]"))
