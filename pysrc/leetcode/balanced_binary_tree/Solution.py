# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def isBalanced(self, root: TreeNode) -> bool:
        # 높이 구하는 함수(재귀적으로 확인도 한다.)
        def get_height(node):
            if not node:
                return 0

            left, right = get_height(node.left), get_height(node.right)

            # 불균형이 감지되거나, 불균형한 조건인 경우
            if left == -1 or right == -1 or abs(left - right) > 1:
                return -1
            return max(left, right) + 1  # 조건에 맞는다면 1씩 증가해서 높이를 증가시킨다.

        return get_height(root) != -1
