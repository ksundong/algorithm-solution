# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def diameterOfBinaryTree(self, root: TreeNode) -> int:
        def depth(p):
            if not p:
                return 0
            nonlocal length
            left, right = depth(p.left), depth(p.right)
            length = max(length, left + right)
            return max(left, right) + 1

        length = 0
        depth(root)
        return length


solution = Solution()
solution.diameterOfBinaryTree(TreeNode(1, TreeNode(2, TreeNode(4), TreeNode(5)), TreeNode(3)))  # 3
