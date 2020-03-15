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
    - Arrays.copyOf를 사용하지 않았더니 0.5 ms가 단축되었다.
11. [나누어 떨어지는 숫자 배열](https://programmers.co.kr/learn/courses/30/lessons/12910)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/dividingnumberarray/Solution.java)
    - 별로 깊게 생각해보지 않아도 되는 문제였다.
12. [두 정수 사이의 합](https://programmers.co.kr/learn/courses/30/lessons/12912)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/twointegersum/Solution.java)
    - 등차수열의 합 공식을 이용해서 풀었다.
    - for문으로 풀면 오래걸림(통과는 함...)
13. [문자열 내 마음대로 정렬하기](https://programmers.co.kr/learn/courses/30/lessons/12915)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/stringsortmyself/Solution.java)
    - 좀 재미있어 보이는 문제다.
    - comparator를 좀 더 재밌게 쓸 수 있었다.
    - 강추문제!!
14. [문자열 내 p와 y의 개수](https://programmers.co.kr/learn/courses/30/lessons/12916)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/stringpandycount/Solution.java)
    - uppercase나 lowercase를 사용하면 속도가 어떻게 변할지는 고민해봐야 할 것 같다.
    - 로직은 간단!
15. [문자열 내림차순으로 배치하기](https://programmers.co.kr/learn/courses/30/lessons/12917)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/stringdescendingorder/Solution.java)
    - 람다식으로 했는데 너무 느린 것 같다.
    - StringBuilder에 reverse 메소드가 있다는 것을 처음 알았다.
16. [문자열 다루기 기본](https://programmers.co.kr/learn/courses/30/lessons/12918)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/basicstringcontrol/Solution.java)
    - 처음엔 Pattern, Matcher를 이용해서 풀었는데, String에 matches라는 메소드가 제공되어서 수정했다.
    - 엄청 짧게 바꾸었다. 정규식으로 풀면 엄청 짧다!
17. [서울에서 김서방 찾기](https://programmers.co.kr/learn/courses/30/lessons/12919)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/kimseobang/Solution.java)
    - 다른 사람도 비슷하게 풀어서... 참고할것이 없었다.
18. [소수 찾기](https://programmers.co.kr/learn/courses/30/lessons/12921)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/primenumber/Solution.java)
    - 처음엔 n^2로 풀었는데 숫자 범위가 백만이어서 속도를 개선할 방법을 찾아보았습니다.
    - 제곱근까지 loop를 돌린다는 내용은 그 이상은 절대 나누어 떨어질 수 없다는 뜻이었습니다.
    - 에라토스테네스의 체라는 풀이 방식도 있어 적용해보았습니다.
19. [수박수박수박수박수박수?](https://programmers.co.kr/learn/courses/30/lessons/12922)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/watermelon/Solution.java)
    - 예전에 풀었던 문젠데, 똑같이 풀었다..?
    - 수박을 만자 입력해서 substring으로 푼 사람이 있던데, 정말 대단하다 ㅋㅋㅋ
20. [문자열을 정수로 바꾸기](https://programmers.co.kr/learn/courses/30/lessons/12925)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/parseint/Solution.java)
    - 음... 문제출제의도는 모르겠지만, 잘못입력되는 경우가 없다고 해서 parseInt를 사용하였다.
21. [시저 암호](https://programmers.co.kr/learn/courses/30/lessons/12926)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/caesarcipher/Solution.java)
    - char 형에 대해서 깊게 생각하게 만드는 문제였다.
    - 나중에 한 번 더 풀어보는게 좋을 것 같다.
22. [약수의 합](https://programmers.co.kr/learn/courses/30/lessons/12928)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/sumofmeasure/Solution.java)
    - 약수는 생각해보니 2로 나누면 더 적은 loop를 돌 수 있었다.
    - 나중에 다시 풀어봐야겠다.
23. [이상한 문자 만들기](https://programmers.co.kr/learn/courses/30/lessons/12930)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/weirdstring/Solution.java)
    - 문제의 조건을 좀 더 읽는 습관을 들여야겠다고 생각했다. (처음 제출한 건 단어단위로 세는걸 안읽고 풀었다.)
    - 가급적이면 split을 이용하기보다는 character array로 가능한 문제의 경우 char array를 쓰는게 나은 것 같다.
24. [자릿수 더하기](https://programmers.co.kr/learn/courses/30/lessons/12931)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/digitplus/Solution.java)
    - 함정인 경우도 없고, 그냥 숫자의 자릿수를 어떻게 다루는지 생각하는 문제라고 생각된다.
25. [자연수 뒤집어 배열로 만들기](https://programmers.co.kr/learn/courses/30/lessons/12932https://programmers.co.kr/learn/courses/30/lessons/12932)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/naturalnumberarray/Solution.java)
    - 굳이 string으로 만들 필요가 있나 싶어서 while loop를 두 번 사용해서 풀었다.
26. [정수 내림차순으로 배치하기](https://programmers.co.kr/learn/courses/30/lessons/12933)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/integerdesc/Solution.java)
    - 기존 풀이는 int형으로 받아서 참고할만한 것이 없었다.
    - Lambda와 Stream을 쓰는 풀이는 모르겠다. 함수형이 필요한 부분인가 싶다.
    - String으로 변환해서 Long.parseLong을 사용하는 풀이는 좋은 것 같기도 하고... 속도는 잘 나오나??
27. [정수 제곱근 판별](https://programmers.co.kr/learn/courses/30/lessons/12934)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/integersquareroot/Solution.java)
    - Math.sqrt 없이 하는 방법은 없을까? 고민했는데 for loop돌아야 할 것 같아서 별로 효율이 좋진 않을 것 같다.
    - Math.sqrt를 까봤는데, Note that hardware sqrt instructions 라고 하는 것으로 보아 이게 제일 효율적인 것 같다.
    - Math.pow를 쓰기보단 그냥 곱해서 비교를 해주었다.
28. [제일 작은 수 제거하기](https://programmers.co.kr/learn/courses/30/lessons/12935)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/deleteminnum/Solution.java)
    - O(n)으로 풀었다. Stream을 써서 푼 사람도 있었는데, 결국 느리더라...
    - 최소값을 찾고, 그것만 빼고 넣어주는게 가장 빠를 것 같은데, 더 빠른 방법이 있을까?
29. [짝수와 홀수](https://programmers.co.kr/learn/courses/30/lessons/12937)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/evenandodd/Solution.java)
    - 간단한 문젠데, 코드를 어떻게 하면 더 짧게 할 수 있는지도 고민해보는 게 좋은 문제라고 생각한다.
    - 왜 삼항연산자를 쓸 생각을 안했지?
30. [최대공약수와 최소공배수](https://programmers.co.kr/learn/courses/30/lessons/12940)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/gcfandlcm/Solution.java)
    - 재귀로 푸는 풀이는 생각하지 못했는데, 수학적으로 생각한 것인지 궁금했다.
    - 최대공약수 최소공배수를 프로그래밍 언어로 푸니 상당히 까다롭다고 느껴졌다.
31. [콜라츠 추측](https://programmers.co.kr/learn/courses/30/lessons/12943)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/collatzconjecture/Solution.java)
    - 삼항연산자를 의도적으로 사용해보았다. if-else에 비해 가독성이 좋아졌다.
    - while Loop냐 for Loop냐의 관점 차이는 문제의 조건을 어떻게 해석하느냐에 따라 다른 것 같다. 나같은 경우엔 1이 되는 경우가 중요하다 판단했다.
    - 테스트 케이스가 친절해서 오류를 사전에 알 수 있었다. 이 문제는 자료형도 신경써야함을 알려주니까 좋은 문제라고 생각한다.
32. [평균 구하기](https://programmers.co.kr/learn/courses/30/lessons/12944)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/getaverage/Solution.java)
    - 별로 좋지 않은 문제
33. [하샤드 수](https://programmers.co.kr/learn/courses/30/lessons/12947)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/harshadnumber/Solution.java)
    - 숫자를 한 자리씩 분리하는 기법말고는 그닥 좋지않은 문제...
34. [핸드폰 번호 가리기](https://programmers.co.kr/learn/courses/30/lessons/12948)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/maskingphonenumber/Solution.java)
    - 정규식을 사용하려고 했는데, 비효율적인 것 같아서 그냥 char배열로 만들어서 풀었다.
35. [행렬의 덧셈](https://programmers.co.kr/learn/courses/30/lessons/12950)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/sumofprocession/Solution.java)
    - 문제 조건이 명확하지 않아서 별로였다.
    - 신기한건, length2를 미리 선언해 주는게 더 느리다는점... 편차가 어느정도 있겠지만, 마지막 조건의 경우 5ms 차이가 났다.
36. [x만큼 간격이 있는 n개의 숫자](https://programmers.co.kr/learn/courses/30/lessons/12954)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/xdistancenumbers/Solution.java)
    - 생각할 여지가 별로 없는 문제였다.
37. [직사각형 별찍기](https://programmers.co.kr/learn/courses/30/lessons/12969)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/makerectangle/Solution.java)
    - 이런 문제가 왜 있을까... 테스트케이스는 귀찮아서 만들지 않았다.
38. [예산](https://programmers.co.kr/learn/courses/30/lessons/12982)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/budget/Solution.java)
    - 괜찮은 문제였다. nlogn이 최선의 방법이라고 생각한다.
39. [비밀지도](https://programmers.co.kr/learn/courses/30/lessons/17681)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/secretmap/Solution.java)
    - 출력에 문제가 있어서 테스트케이스가 제대로 동작하지 않았다. 덕분에 공백이 중복되면 제거하는 코드를 넣어야 하는줄 알고 문제를 다시 읽어봤다.
    - 그건 논외로 치고 문제자체는 괜찮았다. binaryString을 사용하는 풀이가 있었는데, 내 풀이에 약 10배이상이 걸렸다. 왜냐면 GC가 동작하기 때문이라 생각한다.
    - 재귀함수로 푸는 풀이도 있는데, 괜찮은 것 같다. 일단 문제 조건 자체가 16자리까지 받으니까...
    - 비트연산, 비트 시프트연산으로 풀이한 것을 봤는데, 잘 안써서 그런가 어떻게 동작할지 예측이 되지 않았다. 더 공부해야겠다.
40. [실패율](https://programmers.co.kr/learn/courses/30/lessons/42889)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/failurerate/Solution.java)
    - 잘 안풀려서 풀이를 찾아봤는데 괜찮은 풀이가 없어서 다시 풀었다...
    - 23, 24번 케이스에서 실패하는데 일단, 여기까지 한 걸 올려둔다.
    - double 형으로 했더니 제대로 동작했다. overflow 문제일까?
41. [다트 게임](https://programmers.co.kr/learn/courses/30/lessons/17682)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/dartgame/Solution.java)
    - 정규표현식으로 풀어보았다.
    - 수량자로는 그룹핑이 안돼서 각각 써주었다.
    - `find()`를 써줘야 하는걸 처음 알았다. `group(num)` 이 `num` 이 0이면 전체 다가져오는거였다.
    - 생각보단 쉽게 풀어낸 것 같은데, 나중에 풀면 더 쉽게 풀 수 있지 않을까?
    - flow 때문에 코드가 세로로 길어져서 좀 슬프다.
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
   - [퀵 정렬](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/thinking/sorting/QuickSort.java)
3. 위 정렬의 장단점과 복잡도에 대해 알아보자
4. count sort와 radix sort의 코드를 이해해보고 장점은 무엇인지 알아보자
5. 해시에 대해 더 공부해보자
6. 이진 트리가 무엇인지 학습한다.
7. 이진 검색트리가 무엇인지 학습한다.
8. 트리의 순회에 대해 학습한다.
9. 힙이 무엇인지와 힙 정렬에 대해 학습한다.
10. 이진 탐색을 구현해본다.
    - [이진 탐색](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/thinking/search/BinarySearch.java)
    - 재귀적으로 구현해본다.
    - 반복문으로 구현해본다.
11. 재귀 공부
    - [입력된 배열의 합을 구하는 재귀함수](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/thinking/recursion/ArraySum.java)
      재귀적으로 생각하기가 쉽지가 않았다..! 재귀에 대한 연습을 많이 해야할 것 같다.
    - [입력된 리스트의 원소의 갯수를 구하는 재귀함수]()
    - [입력된 리스트의 가장 큰 수를 찾는 재귀함수]()
