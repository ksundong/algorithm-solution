from typing import List


class MyCircularQueue:

    def __init__(self, k: int):
        self.array_queue: List = [None] * k
        self.max_length: int = k
        self.front: int = 0
        self.rear: int = 0

    def enQueue(self, value: int) -> bool:
        if self.isFull():
            return False
        self.array_queue[self.rear] = value
        self.rear = (self.rear + 1) % self.max_length
        return True

    def deQueue(self) -> bool:
        if self.isEmpty():
            return False
        self.array_queue[self.front] = None
        self.front = (self.front + 1) % self.max_length
        return True

    def Front(self) -> int:
        return -1 if self.array_queue[self.front] is None else self.array_queue[self.front]

    def Rear(self) -> int:
        return -1 if self.array_queue[self.rear - 1] is None else self.array_queue[self.rear - 1]

    def isEmpty(self) -> bool:
        return self.front == self.rear and self.array_queue[self.front] is None

    def isFull(self) -> bool:
        return self.front == self.rear and self.array_queue[self.front] is not None


# Your MyCircularQueue object will be instantiated and called as such:
# obj = MyCircularQueue(k)
# param_1 = obj.enQueue(value)
# param_2 = obj.deQueue()
# param_3 = obj.Front()
# param_4 = obj.Rear()
# param_5 = obj.isEmpty()
# param_6 = obj.isFull()


circularQueue: MyCircularQueue = MyCircularQueue(5)
print(circularQueue.enQueue(10))  # True
print(circularQueue.enQueue(20))  # True
print(circularQueue.enQueue(30))  # True
print(circularQueue.enQueue(40))  # True
print(circularQueue.Rear())  # 40
print(circularQueue.isFull())  # False
print(circularQueue.deQueue())  # True
print(circularQueue.deQueue())  # True
print(circularQueue.enQueue(50))  # True
print(circularQueue.enQueue(60))  # True
print(circularQueue.Rear())  # 60
print(circularQueue.Front())  # 30
