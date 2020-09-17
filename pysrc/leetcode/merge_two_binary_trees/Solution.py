# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def mergeTrees(self, t1: TreeNode, t2: TreeNode) -> TreeNode:
        # 둘 다 있으면
        if t1 and t2:
            return TreeNode(t1.val + t2.val, self.mergeTrees(t1.left, t2.left), self.mergeTrees(t1.right, t2.right))
        else:
            return t1 or t2
