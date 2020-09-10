import re
from collections import Counter


def solution(str1, str2):
    # 문자열을 쪼개서 Counter에 넣는다.
    str1_counter = split_and_count(str1)
    str2_counter = split_and_count(str2)

    # 교집합과 합집합을 구하고 나눈다.
    inter = str1_counter & str2_counter
    union = str1_counter + str2_counter - inter
    inter_list = list(inter.elements())
    union_list = list(union.elements())
    try:
        j = len(inter_list) / len(union_list)
    except ZeroDivisionError:
        j = 1

    return int(j * 65536)


def split_and_count(s):
    str_list = [s[i: i + 2] for i in range(len(s) - 1)]
    filter_list = []

    for s in str_list:
        s = s.lower()
        if not bool(re.search(r'[^(a-z)]', s)):
            filter_list.append(s)

    return Counter(filter_list)
