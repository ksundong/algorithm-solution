class Trie:

    def __init__(self):
        self.root = Node()

    def insert(self, word: str) -> None:
        current = self.root
        for char in word:
            if char not in current.children:
                current.children[char] = Node()
            current = current.children[char]
        current.is_word = True

    def search(self, word: str) -> bool:
        current = self.root
        for char in word:
            if char not in current.children:
                return False
            current = current.children[char]

        return current.is_word

    def startsWith(self, prefix: str) -> bool:
        current = self.root
        for char in prefix:
            if char not in current.children:
                return False
            current = current.children[char]

        return True


class Node:

    def __init__(self):  # 인스턴스마다 달라져야하므로 초기화 함수에 작성
        self.children = {}
        self.is_word = False  # 마지막임을 알아야 함(검색시 필요)
