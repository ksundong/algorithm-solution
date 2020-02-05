# algorithm-solution

알고리즘 문제풀이를 올리는 저장소

## [프로그래머스](https://programmers.co.kr/)

1. [완주하지 못한 선수](https://programmers.co.kr/learn/courses/30/lessons/42576)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/incompleteplayer/Solution.java)
2. [문자열 압축](https://programmers.co.kr/learn/courses/30/lessons/60057)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/compressstring/Solution.java)
   - 해시를 사용해봐야 이점이 없는 듯 싶어 해시는 사용하지 않았다.
3. [K번째수](https://programmers.co.kr/learn/courses/30/lessons/42748)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/19427fc431bf5b53fdea06dd4ced059383810885/src/main/java/dev/idion/programmers/kthnumber/Solution.java)
   - 다른 사람 풀이를 확인해보니 quick sort를 직접 구현하는 경우도 있었다.
4. [가장 큰 수](https://programmers.co.kr/learn/courses/30/lessons/42746)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/biggestnumber/Solution.java)
   - String을 합친것을 비교하는 것 vs 같은 string을 4번 반복한 후 4자리까지 자르는 것
   - 예외 사항이 좀 많다. 0이나 12, 121 같은것.
   - 소트 메소드를 활용하는 Comparator를 잘 활용하면 정렬문제를 좀 더 빠르게 풀 수 있을 것 같다.
5. [위장](https://programmers.co.kr/learn/courses/30/lessons/42578)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/camouflage/Solution.java)
   - 이름이 겹치는 의상이 없다는 것이 힌트고, 두번째는 부위별로 안입거나, 하나만 입거나의 경우의 수라는게 힌트였다.
   - 경우의 수를 계산해보면 의상의 개수 + 1(안입는 경우)를 각각 곱해준 후, 모두 안입는 경우의 수인 1을 빼주면 된다.
6. [전화번호 목록](https://programmers.co.kr/learn/courses/30/lessons/42577)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/phonenumberlist/Solution.java)
   - 이중 for문을 이용하여 풀었다.
   - 사전에 정렬을 하고 뒤의 것을 앞의 것이 포함되어있는지 확인했다.(String형태는 사전식 정렬을 하기 때문에)
   - 해시를 적용한 풀이를 보았는데 2중 for문, for문 구조로 더 복잡해지는 경향이 있어 풀이에선 제외하였다.
7. [체육복](https://programmers.co.kr/learn/courses/30/lessons/42862)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/gymsuit/Solution.java)
   - 일단 Test Case를 만들었다.
   - 일단 배열의 length값을 빼고 더해보았다. (test 1, 3 실패)
   - 만들어 둔 Test Case를 모두 만족하는 코드를 작성하였다.
   - 예외 상황이 있어서(조건을 제대로 안읽어서) 코드를 수정했다. (먼저 같은 경우를 비교)
8. [2016년](https://programmers.co.kr/learn/courses/30/lessons/12901)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/year2016/Solution.java)
   - Test Case를 하나 만들었다.
   - 너무 쉬웠다. 역시 CodeSquad Java Playground!
   - https://www.inflearn.com/course/java-codesquad/dashboard
9. [가운데 글자 가져오기](https://programmers.co.kr/learn/courses/30/lessons/12903)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/getmiddlecharacter/Solution.java)
   - Test Case를 가져와서 만들었다.
   - 역시 너무 쉬웠다.
   - 좀 더 짧은 코드를 만들기 위해서, 짝수, 홀수 모두 통용되는 코드를 짜기위해 노력했다.
10. [같은 숫자는 싫어](https://programmers.co.kr/learn/courses/30/lessons/12906)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/7229adab2d/src/main/java/dev/idion/programmers/noduplicatenumber/Solution.java)
    - 풀이는 했지만 공간복잡도가 높아지는 단점이 있다.
---

## [LeetCode](https://leetcode.com/)

1. [Reverse Integer](https://leetcode.com/problems/reverse-integer/)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/leetcode/reverseinteger/Solution.java)
2. [Two Sum](https://leetcode.com/problems/two-sum/)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/leetcode/twosum/Solution.java)
3. [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/leetcode/removeduplicates/Solution.java)
   - 내부 배열 조정한 것을 어떻게 테스트해야하는지 모르겠음.. 찾아보기!!
   - LeetCode 솔루션을 봤는데 문제를 잘못 이해했었다!
4. [Happy Number](https://leetcode.com/problems/happy-number/)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/leetcode/happynumber/Solution.java)
   - 처음에 String으로 만들어서 해결했는데 31ms가 나왔다.
   - 이것을 10으로 나머지 연산과 나누기 연산을 하는 방식으로 8ms까지 줄였다.
   - Map을 Set으로 바꾸니 1ms가 걸렸다.
5. [Single Number](https://leetcode.com/problems/single-number/)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/leetcode/singlenumber/Solution.java)
   - 처음에 HashMap을 이용해서 해결했는데 21ms가 나왔다.
   - 같은 수가 2번까지만 나올 수 있으므로, 비트 xor연산을 하면 같은 수는 0이되고, 하나인 수만 남게되어 가장빠른 솔루션이다.😮

---

## [BAEKJOON](https://www.acmicpc.net/)

1. [수 정렬하기 3](https://www.acmicpc.net/problem/10989)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/baekjoon/sortnumber3/Main.java)
   - count sort를 이용하면 더 빠르게 할 수 있다. (메모리도 적게먹고, 속도도 O(nlogn) -> O(n)이라 더 빠르게 되었다.)
2. [트리 순회](https://www.acmicpc.net/problem/1991)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/baekjoon/treetraversal/Main.java)
   - 전위 순회, 중위 순회, 후위 순회가 무엇인지 몰라서 확인해보기로 했다.
   - 직접 Tree 구조를 만들어보기로 했다.
   - 테스트 코드는 통과했다.
   - 백준에 제출한 결과 76ms가 나왔다.

---

## 생각해보기

1. 주어진 문자열에 중복된 문자가 있는지 여부를 검사하는 함수
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/thinking/overlapchar/Solution.java)
2. 버블 정렬, 삽입 정렬, 퀵 정렬, 머지 정렬, 힙 정렬을 직접 구현해 보자
   - [버블 정렬](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/thinking/sorting/BubbleSort.javahttps://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/thinking/sorting/BubbleSort.java)
   - [삽입 정렬](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/thinking/sorting/SelectionSort.java)
3. 위 정렬의 장단점과 복잡도에 대해 알아보자
4. count sort와 radix sort의 코드를 이해해보고 장점은 무엇인지 알아보자
5. 해시에 대해 더 공부해보자
6. 이진 트리가 무엇인지 학습한다.
7. 이진 검색트리가 무엇인지 학습한다.
8. 트리의 순회에 대해 학습한다.
9. 힙이 무엇인지와 힙 정렬에 대해 학습한다.