class MyCircularQueue:

    def __init__(self, k: int):
        """
        Initialize your data structure here. Set the size of the queue to be k.
        """

    def enQueue(self, value: int) -> bool:
        """
        Insert an element into the circular queue. Return true if the operation is successful.
        """

    def deQueue(self) -> bool:
        """
        Delete an element from the circular queue. Return true if the operation is successful.
        """

    def Front(self) -> int:
        """
        Get the front item from the queue.
        """

    def Rear(self) -> int:
        """
        Get the last item from the queue.
        """

    def isEmpty(self) -> bool:
        """
        Checks whether the circular queue is empty or not.
        """

    def isFull(self) -> bool:
        """
        Checks whether the circular queue is full or not.
        """


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
