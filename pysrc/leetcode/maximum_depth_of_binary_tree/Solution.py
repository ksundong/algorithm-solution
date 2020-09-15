# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def maxDepth(self, root: TreeNode) -> int:
        if not root:
            return 0
        depth = 1

        def get_depth(cur: TreeNode, d: int) -> int:
            child_left, child_right = cur.left, cur.right

            if not child_left and not child_right:
                return d
            else:
                left_depth = get_depth(child_left, d + 1) if child_left else 0
                right_depth = get_depth(child_right, d + 1) if child_right else 0
                return max(left_depth, right_depth)

        return get_depth(root, depth)


solution = Solution()
print(solution.maxDepth(TreeNode(3, TreeNode(9), TreeNode(20, TreeNode(15), TreeNode(7)))))  # 3
