# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def longestUnivaluePath(self, root: TreeNode) -> int:
        self.ans = 0

        def arrow_len(node):
            if not node:
                return 0
            # 재귀
            left_length, right_length = arrow_len(node.left), arrow_len(node.right)

            # 다르면 0임을 의미
            left_arrow = right_arrow = 0
            if node.left and node.left.val == node.val:
                left_arrow = left_length + 1  # 같으면 값 증가
            if node.right and node.right.val == node.val:
                right_arrow = right_length + 1

            # 반환하기 전에 값 갱신
            self.ans = max(self.ans, left_arrow + right_arrow)
            return max(left_arrow, right_arrow)

        arrow_len(root)
        return self.ans
