import collections
from typing import List


class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        # 전처리
        graph = collections.defaultdict(list)
        for x, y in prerequisites:
            graph[x].append(y)

        # 순환구조를 파악하기 위한 자료구조
        traced = set()

        def dfs(a):
            if a in traced:  # 이미 방문한 경우 순환구조임
                return False

            traced.add(a)  # 방문한 위치 저장
            for b in graph[a]:  # 리스트 형태로 관리됨
                if not dfs(b):  # 탈출 조건(내부에서 실패시)
                    return False
            traced.remove(a)  # 방문 이력 제거

            return True

        # graph의 크기가 변경되어서 오류 발생해서 list로 변경해줌(?)
        for x in list(graph):
            if not dfs(x):  # dfs에서 실패하는 경우 순환구조
                return False

        return True
