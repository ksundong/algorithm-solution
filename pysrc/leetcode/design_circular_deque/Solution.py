# Definition for singly-linked list.
class ListNode:
    def __init__(self, val, next=None):
        self.val = val
        self.next = next


class MyCircularDeque:

    def __init__(self, k: int):
        self.head, self.tail = ListNode(None), ListNode(None)
        self.max_size, self.size = k, 0
        self.head.right, self.tail.left = self.tail, self.head  # 이건 왜 되는거야...

    def _link_node(self, node: ListNode, new_node: ListNode):
        n = node.right
        node.right = new_node
        new_node.left, new_node.right = node, n
        n.left = new_node

    def _unlink_node(self, node: ListNode):
        n = node.right.right
        node.right, n.left = n, node

    def insertFront(self, value: int) -> bool:
        if self.isFull():
            return False
        self.size += 1
        self._link_node(self.head, ListNode(value))
        return True

    def insertLast(self, value: int) -> bool:
        if self.isFull():
            return False
        self.size += 1
        self._link_node(self.tail.left, ListNode(value))
        return True

    def deleteFront(self) -> bool:
        if self.isEmpty():
            return False
        self.size -= 1
        self._unlink_node(self.head)
        return True

    def deleteLast(self) -> bool:
        if self.isEmpty():
            return False
        self.size -= 1
        self._unlink_node(self.tail.left.left)
        return True

    def getFront(self) -> int:
        if self.isEmpty():
            return -1
        return self.head.right.val

    def getRear(self) -> int:
        if self.isEmpty():
            return -1
        return self.tail.left.val

    def isEmpty(self) -> bool:
        return self.size == 0

    def isFull(self) -> bool:
        return self.size == self.max_size


# Your MyCircularDeque object will be instantiated and called as such:
# obj = MyCircularDeque(k)
# param_1 = obj.insertFront(value)
# param_2 = obj.insertLast(value)
# param_3 = obj.deleteFront()
# param_4 = obj.deleteLast()
# param_5 = obj.getFront()
# param_6 = obj.getRear()
# param_7 = obj.isEmpty()
# param_8 = obj.isFull()


circularDeque: MyCircularDeque = MyCircularDeque(3)
print(circularDeque.insertLast(1))  # True
print(circularDeque.insertLast(2))  # True
print(circularDeque.insertFront(3))  # True
print(circularDeque.insertFront(4))  # False
print(circularDeque.getRear())  # 2
print(circularDeque.isFull())  # True
print(circularDeque.deleteLast())  # True
print(circularDeque.insertFront(4))  # True
print(circularDeque.getFront())  # 4
