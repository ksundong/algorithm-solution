# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:

    def __init__(self):
        self.val = 0

    def bstToGst(self, root: TreeNode) -> TreeNode:
        if not root:
            return None

        # 이진 탐색 트리의 특성을 활용한 문제
        # 오른쪽 노드의 경우는 오른쪽 노드만 합을 구하면 되고, 왼쪽 노드는 오른쪽 노드, 루트노드의 합
        # 중위 순회 (오른쪽 - 중앙 - 왼쪽) 순으로 값을 합친다.
        self.bstToGst(root.right)
        self.val += root.val
        root.val = self.val
        self.bstToGst(root.left)
        return root
