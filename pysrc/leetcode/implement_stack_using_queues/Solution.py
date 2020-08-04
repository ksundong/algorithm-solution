import collections


class MyStack:

    def __init__(self):
        self.q = collections.deque()

    def push(self, x: int) -> None:  # 데이터를 넣고 추가된 데이터만 맨 앞에 둔다.
        self.q.append(x)
        for _ in range(len(self.q) - 1):
            self.q.append(self.q.popleft())

    def pop(self) -> int:
        return self.q.popleft()

    def top(self) -> int:
        return self.q[0]  # 확인만 한다.

    def empty(self) -> bool:
        return len(self.q) == 0  # 요건 쉬움


# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()


stack: MyStack = MyStack()

stack.push(1)
stack.push(2)
stack.top()  # 2
stack.pop()  # 2
stack.empty()  # False
