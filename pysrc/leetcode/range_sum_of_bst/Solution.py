# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


# L 이상 R 이하
class Solution:
    answer = 0

    def rangeSumBST(self, root: TreeNode, L: int, R: int) -> int:
        if L <= root.val <= R:
            self.answer += root.val

        if root.left:
            self.rangeSumBST(root.left, L, R)

        if root.right:
            self.rangeSumBST(root.right, L, R)

        return self.answer
