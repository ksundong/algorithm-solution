class MyQueue:

    def __init__(self):
        self.stack = []
        self.substack = []

    def push(self, x: int) -> None:
        self.stack.append(x)

    def pop(self) -> int:
        for _ in range(len(self.stack) - 1):
            self.substack.append(self.stack.pop(-1))
        ret_val = self.stack.pop(-1)
        for _ in range(len(self.substack)):
            self.stack.append(self.substack.pop(-1))
        return ret_val

    def peek(self) -> int:
        for _ in range(len(self.stack) - 1):
            self.substack.append(self.stack.pop(-1))
        ret_val = self.stack[-1]
        for _ in range(len(self.substack)):
            self.stack.append(self.substack.pop(-1))
        return ret_val

    def empty(self) -> bool:
        return len(self.stack) == 0


# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()

queue: MyQueue = MyQueue()
queue.push(1)
queue.push(2)
print(queue.peek())  # returns 1
print(queue.pop())  # returns 1
print(queue.empty())  # returns false
