from collections import defaultdict


class MyHashMap:

    def __init__(self):
        self.dict = defaultdict(lambda: -1)

    def put(self, key: int, value: int) -> None:
        self.dict[key] = value

    def get(self, key: int) -> int:
        return self.dict[key]

    def remove(self, key: int) -> None:
        self.dict[key] = -1


# Your MyHashMap object will be instantiated and called as such:
# obj = MyHashMap()
# obj.put(key,value)
# param_2 = obj.get(key)
# obj.remove(key)

hashMap: MyHashMap = MyHashMap()
hashMap.put(1, 1)
hashMap.put(2, 2)
print(hashMap.get(1))  # 1
print(hashMap.get(3))  # -1
hashMap.put(2, 1)
print(hashMap.get(2))  # 1
hashMap.remove(2)
print(hashMap.get(2))  # -1
