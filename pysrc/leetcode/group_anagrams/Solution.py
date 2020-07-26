from collections import defaultdict
from typing import List


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # 정렬된 문자열의 값을 key로 문자열의 list를 저장
        str_dict = defaultdict(list)
        for word in strs:  # 문자열 리스트 순회
            # sorted는 list를 반환하는데 list는 unhashable하므로 join을 이용해 str로 바꾼다.
            str_dict[''.join(sorted(word))].append(word)  # 정렬된 문자열로 리스트에 추가한다.
        return str_dict.values()  # 딕셔너리의 값들을 list형태로 반환한다. 괜히 리스트 컴프리헨션을 썼다.


print(Solution.groupAnagrams(None, ["eat", "tea", "tan", "ate", "nat", "bat"]))
