from typing import List


# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> TreeNode:
        if inorder:
            idx = inorder.index(preorder.pop(0))

            node = TreeNode(inorder[idx])
            # 전위순회이기 떄문에 left를 먼저 수행한다.
            node.left = self.buildTree(preorder, inorder[:idx])
            node.right = self.buildTree(preorder, inorder[idx + 1:])

            return node
