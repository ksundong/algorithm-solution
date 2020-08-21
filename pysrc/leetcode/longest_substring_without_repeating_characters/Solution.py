class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        max_len = cur_len = 0
        char_dict = {}
        for char in s:
            if char in char_dict:
                max_len = max(cur_len, max_len)
                cur_len = 1
                char_dict = {char: 0}
            else:
                cur_len += 1
                char_dict[char] = 0

        if char_dict:
            max_len = max(cur_len, max_len)

        return max_len


solution: Solution = Solution()
print(solution.lengthOfLongestSubstring('dvdf'))  # 3
print(solution.lengthOfLongestSubstring('abcabcbb'))  # 3
print(solution.lengthOfLongestSubstring('bbbbb'))  # 1
print(solution.lengthOfLongestSubstring('pwwkew'))  # 3
