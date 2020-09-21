# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    prev = float('-inf')
    result = float('inf')

    # 가장 작은 경우는 왼쪽 가지의 맨 오른쪽 단말노드 혹은 오른쪽 가지의 맨 왼쪽 단말노드
    def minDiffInBST(self, root: TreeNode) -> int:
        if root.left:
            self.minDiffInBST(root.left)

        self.result = min(self.result, root.val - self.prev)
        self.prev = root.val

        if root.right:
            self.minDiffInBST(root.right)

        return self.result
