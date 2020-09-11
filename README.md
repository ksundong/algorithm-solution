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
42. [다리를 지나는 트럭](https://programmers.co.kr/learn/courses/30/lessons/42583) {다시 풀어볼 문제}
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/truckpassingbridge/Solution.java)
    - 여러 대의 트럭이 **일차선** 다리를 **정해진** 순으로 건너려 한다. => Queue 자료구조
    - 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아야 한다.
    - 트럭은 1초에 1만큼 움직인다. 다리의 길이는 bridgeLength 값이고, 무게는 weight만큼 견딘다.
    - 이 문제는 큐를 활용하는 문제지만, 객체지향적으로 풀어볼 문제였다.
    - 나는 접근을 큐만 사용해서 저장하고 꺼내는 방식만 사용하였고, 시간을 전혀 고려하지 못했다.
    - 대부분의 풀이는 시간이나 움직임을 계산했고, 이런 방식을 잘 생각하지 못했던 것 같다.
    - [프로그래머스 풀이](https://programmers.co.kr/learn/courses/30/lessons/42583/solution_groups?language=java)
    - 부족함을 많이 느낀 문제였다. 자주자주 풀어보자.
43. [프린터](https://programmers.co.kr/learn/courses/30/lessons/42587)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/printer/Solution.java)
    - 우선순위 큐를 응용하는 문제같다.
    - 우선순위가 계속 변경되는 포인트를 잘 잡지 못해서 풀이를 검색했다.
    - 나중에 다시 풀어보자.
44. [기능개발](https://programmers.co.kr/learn/courses/30/lessons/42586)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/featuredevelop/Solution.java)
    - 먼저 작업이 시작한 경우 다음 기능은 개발이 완료되더라도 배포되지 않는다.
    - 객체지향적으로 접근했더니 상당히 잘 풀렸다. 20분 좀 넘게 걸렸나?
    - 람다식을 적극 활용한 풀이도 좋아보인다.
    - 동시에 스택을 활용하려고 노력했다. 결국 Queue 인터페이스의 구현체는 LinkedList이므로 iterator도 활용해보았다.
    - 시간은 거의 2ms 내외로 걸렸다. 0이 들어가는 경우가 있었는데, 예외처리가 좀 아쉽긴 하다.
45. [주식가격](https://programmers.co.kr/learn/courses/30/lessons/42584)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/stockprice/Solution.java)
    - 이전 가격과 다음 가격을 비교하면서 작아지면 카운트를 초기화하는 방식으로 계산해야할 것 같다.
    - 100000개라면 최대 n^2 까지만 가능할 것 같다.
    - 스택을 사용해서 풀어보려고 했는데, 테스트 케이스는 통과하는데 다른건 통과하지 못해서 그냥 for loop로 해결해보려고한다.
    - for loop가 훨씬 직관적으로 코드가 들어오는 것 같다.
    - 그리고 O(n^2)가 아니면 안되는 것인지... 스택 자료구조를 적용해도 문제풀이는 똑같아서... 문제가 잘못된건 아닐까 생각한다.
46. [탑](https://programmers.co.kr/learn/courses/30/lessons/42588)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/tower/Solution.java)
    - 높이가 같으면 수신할 수 없다.
    - 수신하는 탑이 바로 들어가게 된다.
    - 스택으로 풀면 더 어려울 것 같은 느낌이 든다. 그래서 일단 배열을 사용해보기로 했다.
    - 이중 포문이 나올 수 밖에 없는 문제고 가장 간단한 풀이를 생각해냈다.
    - 스택을 활용한 것과 별반 다를바 없는 풀이였다.
47. [멀쩡한 사각형](https://programmers.co.kr/learn/courses/30/lessons/62048)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/finesquare/Solution.java)
    - 가로 길이 w, 세로 길이 h인 직사각형 종이
    - 대각선 꼭지점 끼리 잇는 직선으로 나누어져있다.
    - 가로 세로 1cm의 정사각형으로 사용할 수 있는 만큼만 사용.
    - 전체를 구하는 것은 w * h
    - 사용할 수 없는 칸의 개수는 어떻게 구할까?
    - 1 * 2 라면 사용할 수 없는 칸은 2개
    - 1 * 3 이라면 사용할 수 없는 칸은 3개
    - 2 * 3 이라면 사용할 수 없는 칸은 4개
    - 2 * 4 라면 4개 (1 * 2)의 확장이므로...
    - 3 * 4 라면 사용할 수 없는 칸은 6개
    - 3 * 5 라면 사용할 수 없는 칸은 7개
    - 직사각형 이므로 정사각형인 경우는 고려하지 않아도 된다.
    - 예제 조건도 결국 1 * 2 패턴이 8배된 것이어서 16개이다.
    - 그러면 어떻게 대각선 패턴을 구할 수 있을까?
    - 보면 w + h - 1이 사용할 수 없는 칸의 개수이다.
    - 이게 확장된다면? 아마 (w/최대공약수 + h/최대공약수 - 1) * 최대공약수 일 것이다. 즉 w + h - 최대공약수 이다.
    - 최대 공약수는 어떻게 구하더라.. 예전에 푼 문제를 참고해서 for문을 돌렸던 것 같으니 적용한다.
    - 여기서 input의 크기가 1억이므로 O(n)만 가능함을 알 수 있다.
    - 전체 개수 - 사용불가능한 개수 = 정답.
    - 최대공약수를 구하는 알고리즘 중 하나인 유클리드 호제법을 사용하면 더 나은 것 같다.
        - ```java
          public int gcd(int p, int q) {
            if (q == 0) {
              return p;
            }
            return gcd(q, p % q);
          }
          ```
          시간 복잡도가 O(log(n+m)) 이라고 한다.
48. [스킬트리](https://programmers.co.kr/learn/courses/30/lessons/49993)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/skilltree/Solution.java)
    - 게임에 익숙해선지 모르겠지만 문제가 좀 이상했다.
    - 어쨌든 중요한 것은 순서가 정해져 있다는 것이다. 그리고 존재 유무로 판단하면 안될 것 같다.
    - 있는지 확인하고 -> 순서에 맞는지 확인해야 맞을 것 같다.
    - 별다른 edge case가 있을까? 조건이 되게 많아서 그럴 일은 없을 것 같다.
    - 정규표현식으로 풀면 어떨까?
    - 하나 빼먹은게 있었다. 스킬트리에서 안배우는 경우도 존재했다. 따라서 .*로 잇는 방법은 불가능
    - skill을 제외한 문자열을 없앤다면? 그러면 스킬 종류만 남지 않을까?
    - 그리고 나서 skill.indexOf를 먹이면 위치가 0으로 나오지 않을까?
    - 속도는 20ms 정도 나왔다.
49. [쇠막대기](https://programmers.co.kr/learn/courses/30/lessons/42585)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/ironbar/Solution.java)
    - 최대 O(n^2) solution이 나와야한다.
    - 쌍을 이루니 스택을 활용한 문제일 것 같다.
    - 스택을 사용하고 싶었는데 레이저 부분에서 문제가 되었다. 대부분은 레이저를 replace하는 식으로 풀었다.
    - 그냥 더하고 빼는 방법도 가능해서 이렇게 풀었다.
    - 스택을 쓰는 이유는 무엇인가 저장을 할 용도로 써야한다고 생각했기 때문이다.
    - 다들 의미없는 값을 push하고 pop을 한다. peek만 쓰임이 조금 있었다.
    - 스택 풀이도 주의깊게 봐두긴 해야할 것 같다.
50. [카카오프렌즈 컬러링북](https://programmers.co.kr/learn/courses/30/lessons/1829)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/coloringbook/Solution.java)
    - 순회를 이용해서 풀어야 할 것 같다.
    - 왼쪽, 아랫쪽을 체크해서 같다면 같은 영역이다.
    - HashMap을 써서 풀려고 했는데, 중복되는 Key를 가지는 영역은 어떻게하지?
    - 질문을 보니 BFS 문제같다. BFS는 잘 몰라서 풀이를 보면서 따라가기로 했다.
    - BFS의 핵심은 이미 방문한 곳은 다시 체크하지 않게끔 하는 것 같다.
51. [소수 찾기](https://programmers.co.kr/learn/courses/30/lessons/42839)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/findprime/Solution.java)
    - 최대 7자리의 숫자가 만들어질 수 있다.
    - 만들어질 수 있는 수를 모두 만들고 이 수가 소수인지 판단해야 한다.
    - 일단 에라토스테네스의 체를 적용하는 게 좋을 것 같다. length를 가지고 판단한다. 시간 복잡도는 O n log log n 이라고 한다.
    - 숫자 조합은 어떻게 만들 수 있을까? 이게 전체 다 사용하는 것이 아니라, 일부만 사용할 수도 있는데... 경우의 수가 너무 많다.
    - 순열 알고리즘에 대해서 찾아보았다. (https://gorakgarak.tistory.com/522)
    - 순열이 잘 이해가 안간다... 흑흑... 나중에 다시 풀어보자
52. [큰 수 만들기](https://programmers.co.kr/learn/courses/30/lessons/42883)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/makebignumber/Solution.java)
    - 그냥 역순 정렬을 해서 String을 만들면 되지 않을까?
    - 잘못된 접근 방법인 것 같다. sorting을 하지 않고 만들 수 있는 최고로 큰 수를 찾아내는 문제같다.
    - 탐욕법이라고 하였으니, 그 때 상황에서의 최선의 선택을 하는게 맞는 것 같다.
    - 백만자리니까 O(n^2) 풀이도 불가능하다. 최대 nlogn이 한계인 것 같다. 하지만, 정렬도 안되어있어서 그냥 n^2 풀이가 안된다고만 이해하고 있어야 할 것 같다.
    - 제거가능한 숫자의 개수만큼 반복문들 수행하도록 하였다.
    - 왜 그리디가 적용 가능한가? 숫자를 제거할 때, 처음부터 작은 수를 제거해 나가다 보면 정답이 되는 류의 문제다.
    - 즉, 부분의 최적해가 전체의 최적해가 되는 류의 문제다.
    - 코드는 간단하게 나왔는데, 어렵다..
    - 최초위치 지정을 0번째로 해두면 안되는 것 같다. Edge 케이스는 무엇일까?
    - 일단 마지막 index로 변경했더니 잘 동작한다. Edge 케이스는 생각해봐야겠다.
53. [조이스틱](https://programmers.co.kr/learn/courses/30/lessons/42860)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/programmers/joystick/Solution.java)
    - 항상 최선의 선택을 해야한다.
    - 대문자로 이루어져있으므로 char 뺄셈이 가장 적은 상황을 고려하면 되지 않을까?
    - 가운데 문자가 무엇이지? M?
    - 일단 모든 글자를 순회해야 된다. 왜냐하면 왼쪽 오른쪽인지도 판단해야하기 때문이다.
    - 위 아래 판단은 char 연산, 좌우 판단은 index 연산으로 계산하면 될 것 같다.
    - int type으로 충분할 것 같다.
    - 일단 모든 문자는 움직여야 하므로 이를 답에 더해준다.
    - 그리고 나서 최소 이동거리를 더해주면 끝!
    - [참고](https://keepgoing0328.tistory.com/71)
    - 그리디로 풀면 안 풀리는 케이스가 있다고 하지만, 어찌되었든 통과는 했다.
    - 점점 어려워진다... 어떻게 공부해야하는 걸까...

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
6. [Palindrome Number](https://leetcode.com/problems/palindrome-number)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/leetcode/palindromenumber/Solution.java)
   - String으로 변환하는 솔루션을 사용했다. 역시 속도는 느리다... Runtime: 13 ms, faster than 12.68%
   - Solution을 따라했다. 최대한 코드를 이해하는데 주안점을 두었다. Runtime: 6 ms, faster than 100.00%

### [LeetCode Challenge](https://leetcode.com/explore/)

#### May

1. [Ransom Note](https://leetcode.com/explore/featured/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3318/)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/leetcode/challenge/ransomnote/Solution.java)
   - 처음엔 HashMap을 이용해서 풀었다. 53ms가 걸려서 이 방법은 느리다고 생각됐다.
   - LeetCode에서 제출된 답안중 0ms가 걸린 Solution을 분석했다.
   - 나와의 차이는 HashMap을 굳이 안쓴 점. split으로 나누지 않고 CharArray를 사용한 점. indexOf를 활용한 점.
   - 그냥 너무 잘함...

2. [Number Complement](https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3319/)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/leetcode/challenge/numbercomplement/Solution.java)
   - 비트연산을 활용해보고 싶었다.
   - 처음에 int 전체를 byte로 바꾸는 방법을 썼는데, 이건 보수를 구하는 방법이라... 음수가 나와버렸다.
   - 결국 솔루션을 찾아봤다. 마지막 비트를 바로 더하는게 핵심인듯
   - 그리고 0인 경우는 특이케이스라 바로 처리해줘야했다.

3. [First Unique Character in a String](https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3320/)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/leetcode/challenge/firstuniquechar/Solution.java)
   - 반복되지 않는 Character중 가장 앞에 있는 것의 Index를 반환한다.
   - 없으면 -1을 반환해야 한다.
   - 모두 소문자로 가정한다.
   - 일단 CharArray를 사용하면 될 것 같다.
   - 4ms가 나왔다.
   - 굳이 charArray로 바꿀 필요가 없는 것 같다. 입력의 범위가 소문자 'a' - 'z'이므로 for문을 돌릴 수 있다.
   - 1ms가 나왔다. 사실 솔루션을 보고 했다. 어떻게 lastIndex랑 같은지 비교할 생각을 했지...

4. [Majority Element](https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3321/)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/leetcode/challenge/majorityelement/Solution.java)
   - array의 크기는 n일 때, n/2 보다 많이 등장하는 element가 majority element이다.
   - 빈 배열은 등장하지 않으며, majority element는 반드시 존재한다.
   - 나오는 것을 일일이 세야할 것 같다.
   - HashMap을 사용해서 풀어보았다. Runtime: 8 ms

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
3. [A/B](https://www.acmicpc.net/problem/1008)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/baekjoon/adivideb/Main.java)
   - 브론즈 4 문제였다. 출력 예제를 보지 않고 그냥 만들었다가 틀려버렸다.
   - 이 문제의 핵심은 나누기 연산을 했을 때, 소숫점 몇 번째 자리까지 표시할 것인지가 핵심인 것 같다.
   - `System.out.printf("%.#f%n", 표시할 수 혹은 연산);`
   - 여기서 #은 표시할 자릿수를 의미한다.
4. [사칙연산](https://www.acmicpc.net/problem/10869)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/baekjoon/fourarithmetic/Main.java)
   - 브론즈 5 문제였는데 좀 많이 틀렸다.
   - int 연산하고 나서 절대 char형을 그냥 더하지말고 그냥 String형을 붙이자. char형이 정수값으로 계산이 되어서 문제를 틀리고 있었다.
   - 가급적이면 테스트 코드를 작성해서 원하는 대로 동작하는지 확인하는 습관을 다시금 들이자.
   - 백준풀이는 템플릿을 만들어 놓는 것이 좋을 것 같다.
5. [나머지](https://www.acmicpc.net/problem/10430)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/baekjoon/rest/Main.java)
   - 테스트코드를 기반으로 작성해서 한 번에 정답을 맞출 수 있었다.
6. [곱셈](https://www.acmicpc.net/problem/2588)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/baekjoon/multifly/Main.java)
   - 테스트코드를 기반으로 작성해서 한 번에 정답을 맞출 수 있었다.
   - 숫자는 거꾸로 계산한다는 점을 간과해서 테스트에서 실패했었다. 주의하자.
7. [네 번째 점](https://www.acmicpc.net/problem/3009)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/baekjoon/fourthpoint/Main.java)
   - XOR연산을 이용하여 테스트 코드는 통과하는데, 문제는 틀렸다고 나왔다. 뭐가 문제인지 아직 모르겠다.
   - 그냥 있는지 확인해서 푸는 코드를 작성했는데, 파이썬보다 느려서 확인이 필요하다.
8. [한수](https://www.acmicpc.net/problem/1065)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/baekjoon/hansu/Main.java)
   - 양의 정수 X의 각 자리가 등차수열을 이룰 때, 이를 한수라고 한다.
   - 이 때, 1 <= 한수 <= N 인 한수의 개수를 출력하는 프로그램을 작성한다.
   - 두 자리수 까지는 무조건 한수라고 친다. (예제 출력에 따르면)
   - 한수를 판별하는 것은 999까지만 하면 된다.
   - 한수 검증 로직은 첫째 자리수, 둘째 자리수, 셋째 자리수가 같은지 비교하면 된다.
   - 처음에 예제 입력 출력을 잘못봐서 잘못된 로직으로 작성하였다.
9. [직각삼각형](https://www.acmicpc.net/problem/4153)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/baekjoon/righttriangle/Main.java)
   - 피타고라스의 정리를 응용하는 문제
   - 혹시 몰라서 sorting을 해주었다.
10. [최대공약수와 최소공배수](https://www.acmicpc.net/problem/2609)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/baekjoon/gcfandlcm/Main.java)
    - 최대공약수는 유클리드 호제법으로 푼다. 여기서 조건이 a > b 여야 하므로 Math.max와 Math.min을 사용한다.
    - 아니면 Arrays.sort를 써도 괜찮을 것 같다.
    - 최소공배수는 (a / 최대공약수) * (b / 최대공약수) * 최대공약수 이므로 a * b / 최대공약수 이다.
11. [최소공배수](https://www.acmicpc.net/problem/1934)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/baekjoon/lcm/Main.java)
    - 최소공배수는 결국 a * b / gcf로 구한다.
12. [GCD 합](https://www.acmicpc.net/problem/9613)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/baekjoon/gcdsum/Main.java)
    - 전체 가능한 모든 경우를 다 계산한 합을 구해서 출력해야한다.
    - overflow가 나서 틀렸던 문제다. 왠만하면 Sum하는 작업을 하는 변수는 long 타입으로 두는 편이 좋겠다.
13. [소수 찾기](https://www.acmicpc.net/problem/1978)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/baekjoon/findprime/Main.java)
    - 소수를 찾는 알고리즘이 따로 있을까?
    - 일단 수학적 정의에 입각해서 풀어보도록 하자.(1과 자기자신만으로 나누어 떨어지는 수, 단 1은 포함하지 않는다.)
    - 생각보다 코드 최적화를 안했다고 생각했는데, 76ms로 빠른편이었다... 뭐지...
14. [골드바흐의 추측](https://www.acmicpc.net/problem/6588)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/baekjoon/goldbach/Main.java)
    - 소수를 효과적으로 찾는 알고리즘인 에라토스테네스의 체를 모르면 시간이 더 오래 걸릴 것 같은 문제였다.
    - 300ms 라서 느린편인줄 알았는데, 빠른편이었다.
    - 실버 1은 에라토스테네스의 체를 감안해서 매겨진 등급인 것 같다.
15. [거스름돈](https://www.acmicpc.net/problem/5585)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/baekjoon/changecash/Main.java)
    - 가장 간단한 방법인 loop와 조건문을 통해서 만들었다.
    - 코드라인이 너무 무식해보이는 단점이 있지만, 가장 그리디하지 않을까 싶다.
16. [디지털 티비](https://www.acmicpc.net/problem/2816)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/baekjoon/digitaltv/Main.java)
    - 프로그래머스의 조이스틱과 비슷한 문제다.
    - 문제의 요구사항은 KBS1이 첫 번째, KBS2가 두 번째로 되는 경우를 찾는 것이다.
    - 조이스틱과 다른점은 넘어가는 경우를 배제하는 것이라 그리디로 풀 수 있을 것 같다.
    - 3, 4번의 지문을 자세히 읽어보았다. 가리키고 있던 i와 i + 1의 순서를 변경하고, i + 1 위치를 가리킨다는 것.
    - 즉, 현재 선택한 채널을 그대로 유지한다는 것이다.
    - 그리디하게 풀려면 어떻게 해야할까? 먼저 KBS1을 맨 위로 올리는 경우를 생각해보면 될 것 같다.
    - KBS1이 맨 위에 존재하거나, 아니면 아래에 존재할 것이다.
    - 그리고 나서 KBS2가 존재하는 위치를 탐색하고, 똑같이 수행한다.
    - 맨 위의 원소를 움직이는 경우와 KBS1을 직접 움직이는 경우를 비교한다.
    - 그중 적게걸리는 경우를 출력한다.
    - 스페셜 저지가 정답인 케이스가 여러개인 경우를 의미하는 것을 검색을 통해서 알았다.
    - 처음 제출한 코드가 오답이 되었던 이유는, KBS2가 KBS1보다 앞에 있는 경우를 고려하지 않아서 생긴 문제였다.
17. [ATM](https://www.acmicpc.net/problem/11399)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/baekjoon/atm/Main.java)
    - 정렬을 수행해서 더하는 방법이 있을 것이다.
    - 1000개의 input이므로, nlogn 이라면 충분할 것 같다.
    - 입력 값이 overflow가 발생할 가능성이 있어 long 타입을 써주었다.
    - 왜 이게 실버인지 잘 모르겠다.
    - 왜 이게 그리디인지 잘 모르겠다. 강의도 돈 주고 사야하고 ㅠㅠ(매 순간 최적의 해를 구하도록 만들어줘야해서 그런건가?)
    - 오히려 정렬을 생각하지 못하면 못푸는 문제라고 생각이 들었다.
    - 호눅스에게 물어보았는데, 그리디 알고리즘은 말 그대로 부분해가 최적해가 되면 되는거라고 했다.
18. [동전 0](https://www.acmicpc.net/problem/11047)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/baekjoon/coinzero/Main.java)
    - 동전을 역순으로 더해서 필요한 동전 개수를 구하는 프로그램을 짜야한다.
    - 생각했던 대로 동작했고 실버 1급의 문제는 아닌 것 같다.
19. [회의실배정](https://www.acmicpc.net/problem/1931)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/baekjoon/meetingroom/Main.java)
    - 최적해를 구하려면, 가장 먼저 끝나는 것을 선택하고 이전에 선택한 것과 겹치지 않으면 됨을 알 수 있다.
    - 또한 문제의 조건에서 (1,4) (4,7) 같은 조건의 경우 가능함을 알 수 있다.
    - 정렬기준에서 끝나는 시간이 같은 경우 정렬되는 조건을 설정해주지 않아서 틀렸다. 정렬할 때도 항상 신경써서 하자.
    - Comparator 람다를 사용하면 느려진다. 항상 일관적으로 비교할 때, Comparable을 implement하는 것도 고려해보자.
20. [로프](https://www.acmicpc.net/problem/2217)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/baekjoon/rope/Main.java)
    - 모두 고르게 분배된다는 것이 핵심인 것 같다.
    - 즉, n부터 순회하면서 가장 높은 중량이 걸리는 경우를 찾으면 되는 것 같다.
    - 정렬이 필요할 것 같다.
    - n^2 까지 가능한 것 같다.
21. [30](https://www.acmicpc.net/problem/10610)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/baekjoon/thirty/Main.java)
    - 가장 큰 수 이면서 30의 배수를 만드는 문제
    - 일단 수를 정렬해서 큰 수를 만든 다음 30의 배수인지 체크를 해야할 것 같다.
    - 순서를 바꿨을 때, 30의 배수인 경우가 있을까? 아마 없으니까 그리디 일 것 같다.
    - 런타임 에러가 떴다. 아마 시간복잡도를 고려하지 않은 것 같다.
    - 문제가 거지같았다. 10만자리 수 였다. 이걸 Integer.parseInt를 하려고 했으니...
    - 짧은 솔루션을 보니까 10개 크기의 배열을 생성해서 나온 갯수만큼 했다. countsort의 방식을 차용한 듯 하다.
22. [잃어버린 괄호](https://www.acmicpc.net/problem/1541)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/baekjoon/lostbracket/Main.java)
    - 식의 결과를 최소로 만드는 문제다.
    - 더하기 빼기 이므로 연산의 순서만 생각하면 되지 않을까?
    - 순서대로 읽으면서 -가 등장하는 순간부터 다음 -가 등장할 때 까지 모두 더해서 빼는 것이 맞을 것 같다.
    - 그냥 -가 등장한 이후로부터 다 빼버리면 되는 것 같다.
    - 왜냐면 -가 등장한 이후의 +는 괄호로 감싼다고 가정하면 된다.
23. [문자열](https://www.acmicpc.net/problem/1120)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/baekjoon/string/Main.java)
    - 차이를 최소로 하려면 어떻게 해야할까?
    - 둘이 겹치는 영역이 가장 많은 부분이 곧 최적일 것 같다.
    - A의 앞이나 뒤에 연산을 할 수 있으므로 겹치는 영역의 개수만 체크해주면 된다.
    - 앞에서부터 탐색하고 뒤에서부터 탐색해서 둘중에 더 적게 차이나는 것을 선택하면 될 것 같다.
    - 앞 뒤만 선택하면 안되고, 차이나는 구간 전체를 탐색해야 하는 것 같다.
24. [신입 사원]https://www.acmicpc.net/problem/1946)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/baekjoon/newrecruits/Main.java)
    - 클래스를 만들어서 풀면 보다 쉽게 풀릴 것 같은 문제다.
    - 클래스를 만들어서 정렬을 하면 되지 않을까?
    - 적어도 하나가 다른 지원자보다 떨어지지 않는 자(둘 다 누군가보다 부족하다면 탈락대상)
    - 클래스를 만들지 않고 CountSort 풀이하는 방법이 좀 신기해서 따라해봐야겠다.

## 종만북

1. [록 페스티벌](https://algospot.com/judge/problem/read/FESTIVAL)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/jongmanbook/festival/Main.java)
   - 일단 무식하게 풀어보았다. 당연히 시간초과가 났다.😭
   - n^3을 n^2이라도 줄여보고 싶어서, 찾아보았다. Prefix Sum을 이용하면 될 것 같아서 적용했었다.
   - 근데 오답이다. 더 고민해봐야겠다.

---

## 생각해보기

1. 주어진 문자열에 중복된 문자가 있는지 여부를 검사하는 함수
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/thinking/overlapchar/Solution.java)
2. 버블 정렬, 삽입 정렬, 퀵 정렬, 머지 정렬, 힙 정렬을 직접 구현해 보자
   - [버블 정렬](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/thinking/sorting/BubbleSort.javahttps://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/thinking/sorting/BubbleSort.java)
   - [삽입 정렬](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/thinking/sorting/SelectionSort.java)
   - [퀵 정렬](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/thinking/sorting/QuickSort.java)
   - [버블 정렬(단일 배열)](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/thinking/sorting/MergeSortInPlace.java)
   - [버블 정렬](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/thinking/sorting/MergeSort.java)
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
      꼬리 재귀로 바꾸어 보았다!  
    - [입력된 리스트의 원소의 갯수를 구하는 재귀함수](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/thinking/recursion/ListCount.java)  
      꼬리재귀로 해결해보았다!  
    - [입력된 리스트의 가장 큰 수를 찾는 재귀함수](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/thinking/recursion/LargestNumber.java)
    - [팩토리얼을 구하는 재귀함수](https://github.com/ksundong/algorithm-solution/blob/master/src/main/java/dev/idion/thinking/recursion/Factorial.java)
      꼬리재귀로 해결해보았다!

---

## SQL

### [프로그래머스](https://programmers.co.kr)

1. [최댓값 구하기](https://programmers.co.kr/learn/courses/30/lessons/59415)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/src/main/resources/sql/programmers/maximum-value/maximum.sql)
   - 예제의 정답 부분이 Alias를 이용해야 할 것 같아서 Alias를 이용했다.
   - 하나의 결과만 요구하므로 LIMIT을 사용하고자 했다.
   - 가장 최근이라고 하였으므로, DATETIME의 ORDER BY를 이용하면 될 것 같았다.
   - 문제의 의도를 최대한 반영해서 쿼리를 더 줄였다.

---

## Python

### [LeetCode](https://leetcode.com/)

1. [125. Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)
   - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/valid_palindrome/Solution.py)
   - 주어진 문자열이 팰린드롬이지 확인하라. 대소문자를 구분하지 않으며, 영문자와 숫자만을 대상으로 한다.
   - 소문자로 만들고 있는 개수를 가지고 판단하도록 만들었는데, 중간에 있는 것 때문에 오류가 발생했다.
   - 카운터를 쓰면 안된다. 생각해보니까 앞과 뒤를 동시에 확인해야하는데... 흠...
   - 슬라이싱을 활용하면 될 것 같다.
2. [344. Reverse String](https://leetcode.com/problems/reverse-string/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/reverse_string/Solution.py)
    - 문자열을 뒤집는 함수를 작성하라. 입력값은 문자 배열이며, 리턴 없이 리스트 내부를 직접 조작하라.
    - 파이썬은 문자열자체를 접근하는 것이 불가능 해서 리스트로 준 것 같다.
    - 스왑 함수를 만들면 될까?
3. [937. Reorder Data in Log Files](https://leetcode.com/problems/reorder-data-in-log-files/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/reorder_log_files/Solution.py)
    - 로그를 재정렬하라. 기준은 다음과 같다. 모든 로그는 공백으로 구분된 단어들로 이루어져 있다.
        1. 로그의 가장 앞 부분의 단어는 식별자다.
        2. 문자로 구성된 로그(let)가 숫자 로그(dig)보다 앞에 온다.
        3. 식별자는 순서에 영향을 끼치지 않지만, 문자가 동일한 경우 식별자 순으로 한다.
        4. 숫자 로그는 입력 순서대로 한다.
    - 문제를 이해하는데 좀 시간이 걸렸다.
    - 문자(let) 로그가 먼저오며, 단어의 사전순으로 정렬되고, 단어가 다 똑같은 경우 식별자 뒤의 숫자로 정렬한다.
    - 숫자로그는 원래 순서를 그대로 유지해서 정렬한다.
    - 파이썬의 정렬방식을 잘 모르겠다. 그래서 답을 참고했다.
    - 리스트 컴프리헨션을 이용해서 풀었다.
4. [819. Most Common Word](https://leetcode.com/problems/most-common-word/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/most_common_word/Solution.py)
    - 금지된 단어를 제외한 가장 흔하게 등장하는 단어를 출력하라.
    - 대소문자 구분을 하지 않으며, 구두점 또한 무시한다.
    - Counter를 활용하면 될 것 같다.
    - List Comprehension으로 ban된 단어를 제외하는 것이 나을 것 같다.
5. [49. Group Anagrams](https://leetcode.com/problems/group-anagrams/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/group_anagrams/Solution.py)
    - 문자열 배열을 받아 애너그램 단위로 그룹핑하라.
    - 같은 문자로 이루어져 있는 문자열끼리 그룹핑하는 문제다.
    - 출력의 순서는 무관하다.
    - char 값의 합을 더해서 map에 대한 key로 하고, 같은 key를 list로 관리하는 것은 어떨까?
    - 아스키 코드의 합이 같은 경우가 edge case였다.
    - 정렬을 해줘야 하는 것 같다.
6. [5. Longest Palindrome Substring](https://leetcode.com/problems/longest-palindromic-substring/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/longest_palindromic_substring/Solution.py)
    - 가장 긴 팰린드롬 부분 문자열을 출력하라.
    - 어떻게 접근해야 할지 모르겠다. 일단 패스
7. [1. Two sum](https://leetcode.com/problems/two-sum/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/two_sum/Solution.py)
    - 덧셈하여 타겟을 만들 수 있는 배열의 두 숫자 인덱스를 리턴하라
    - 가장 간단한 방법은 브루트 포스가 있지만, 매우 느릴 것이다.
    - 딕셔너리를 쓰는 편이 가장 빠를 것 같다.
8. [42. Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/trapping_rain_water/Solution.py)
    - 높이를 입력받아 비 온 후 얼마나 많은 물이 쌓일 수 있는지 계산하라.
    - 단순히 두 수의 차만 계산해선 안되는 것 같다.
    - 순차로 탐색하며 투 포인터를 사용해봐야겠다.
    - 문제가 최고 높이에 도달했을 때, 어떻게 해야할지 모르겠다.
    - 일단 패스
9. [15. 3Sum](https://leetcode.com/problems/3sum/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/3sum/Solution.py)
    - 배열을 입력받아 합으로 0을 만들 수 있는 3개의 엘리먼트를 출력하라.
    - 브루트 포스는 고려하지 말자...
    - 하나를 정해놓고 Two sum 문제로 만들어야 하는 것 같다.
    - 풀이 실패
10. [561. Array Partition I](https://leetcode.com/problems/array-partition-i/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/array-partition-i/Solution.py)
    - n개의 페어를 이용한 min(a, b)의 합으로 만들 수 있는 가장 큰 수를 출력하라.
    - 정렬을 해서 합을 구하면 될 것 같다.
    - 약간 그리디한 풀이인 것 같다.
11. [238. Produc of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/product_of_array_except_self/Solution.py)
    - 배열을 입력받아 output[i] 가 자신을 제외한 나머지 모든 요소의 곱셈 결과가 되도록 출력하라.
    - 제약조건이 나눗셈을 하지 말라는 것이 있다. 나눗셈을 하는 것을 생각했는데...
    - 전체합으로 나누는게 쉬우니까 이런 제약조건을 준 것 같다.
    - 브루트 포스로 시도해보자
    - 역시 시간초과로 실패했다.
    - 솔루션을 보니 왼쪽 곱에 오른쪽 부터 곱을 하는 방식으로 푼다고 한다.
12. [121. Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/best_time_to_buy_and_sell_stock/Solution.py)
    - 한 번의 거래로 낼 수 있는 최대 이익을 산출하라.
    - 정렬은 할 수 없다.
    - 시작값은 0으로 두어야 할 것 같다.
    - 매우 느렸다. 더 좋은 방법을 고민해봐야겠다.
    - O(n) 풀이 list slice를 하지 않고, 처음부터 최대 이익과 최소 가격을 갱신해나간다.
13. [234. Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/palindrome_linked_list/Solution.py)
    - 연결 리스트가 팰린드롬 구조인지 판별하라.
    - deque로 만들어서 앞 뒤를 pop해서 비교하면 될 것 같다.
    - 팰린드롬은 deque를 활용하기!
    - 책을 보니 런너를 이용한 풀이가 있었다.
14. [21. Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/merge_two_sorted_lists/Solution.py)
    - 정렬되어 있는 두 연결 리스트를 합쳐라.
    - 새로운 노드를 만들어서 붙여나가면 되지 않을까?
    - 정렬이 되어있기 때문에 비교를 해나가면서 붙이면 된다.
    - 노드는 초기값이 0이기 때문에 이를 적절히 이용해야한다.
    - 더미노드는 반환하면 안되므로 next를 이용하여 반환한다.
15. [206. Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/reverse_linked_list/Solution.py)
    - 연결 리스트를 뒤집어라.
    - 반복문으로도 구현이 가능하고, 재귀로도 구현이 가능하다.
    - 반복으로 구현할 때, 주의할 점은 다중할당을 이용해야 풀린다는 점이다.
    - 재귀는 잘 이해가 안간다...
16. [2. Add Two Numbers](https://leetcode.com/problems/add-two-numbers/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode//Solution.py)
    - 역순으로 저장된 연결 리스트의 숫자를 더하라.
    - 빈 리스트는 주어지지 않는다.
    - 양수만 주어진다.
    - 노드는 단 한 개의 숫자만 가질 수 있다.
    - 10의 나머지 연산을 수행해서 저장하면 될 것 같다. 아니네... 앞자리에 붙여줘야 하네...
    - 더해서 역순 정렬하거나, 역순 정렬을 하면서 더하면 되겠지?
    - 통과는 했는데 너무 느리다 ㅠㅠ..
    - 책에선 전가산기를 응용하여 풀이를 진행했다. 깔끔하게 풀렸다.
17. [24. Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/swap_nodes_in_pairs/Solution.py)
    - 연결 리스트를 입력 받아 페어(pair)단위로 스왑하라.
    - 노드를 두 개씩 건너 뛰면서 각각을 스왑하게하면 되지 않을까?
    - 재귀를 사용하면 맨 밑에서부터 변경됨을 효과적으로 표현할 수 있을 것 같다.
    - 결국 못풀었다. ㅠㅠ
18. [328. Odd Even Linked List](https://leetcode.com/problems/odd-even-linked-list/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/odd_even_linked_list/Solution.py)
    - 연결 리스트를 홀수 노드 다음에 짝수 노드가 오도록 재구성하라. 공간 복잡도 O(1), 시간 복잡도 O(n)에 풀이하라.
    - 어떻게 하면 우아하게 풀이할 수 있을까? 그림을 그려가며 풀어봐야겠다.
    - 그림을 그려가면서 풀었는데 30분 정도 걸렸다. 후...
19. [92. Reverse Linked List II](https://leetcode.com/problems/reverse-linked-list-ii/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/reverse_linked_list_ii/Solution.py)
    - 인덱스 m에서 n까지를 역순으로 만들어라. 인덱스 m은 1부터 시작한다.
    - 역시 그림을 그려서 코드를 대충 생각해보았다.
    - 조건에 따라서 빈 노드가 들어올 일은 없을 것 같다.
    - 그림을 그려가면서 푸니까 확실히 잘 풀리는 것 같다.
20. [20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/valid_parentheses/Solution.py)
    - 괄호로 된 입력값이 올바른지 판별하라.
    - 스택을 활용하는 전형적인 문제였다.
    - 예외 처리를 신경쓰지 않았더니 실패를 많이했다.
    - 집중력이 낮았다.
21. [316. Remove Duplicate Letters](https://leetcode.com/problems/remove-duplicate-letters/)
    - 어려운 문제라 일단 패스
22. [739. Daily Temperatures](https://leetcode.com/problems/daily-temperatures/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/daily_temperatures/Solution.py)
    - 매일의 화씨 온도 리스트 T를 입력받아서, 더 따뜻한 날씨를 위해서는 며칠을 더 기다려야 하는지를 출력하라.
    - 그림을 그려가면서 작성하면 더 잘될 것 같다.
    - 언제 스택에서 빼고, 넣는지를 명확히 하면 될 것 같다.
    - 인덱스의 차이가 일 수가 될 것 같다.
23. [225. Implement Stack Using Queues](https://leetcode.com/problems/implement-stack-using-queues/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/implement_stack_using_queues/Solution.py)
    - 큐를 이용해 다음 연산을 지원하는 스택을 구현하라.
        - push(x): 요소 x를 스택에 삽입한다.
        - pop(): 스택의 첫 번째 요소를 삭제한다.
        - top(): 스택의 첫 번째 요소를 가져온다.
        - empty(): 스택이 비어 있는지 여부를 리턴한다.
    - 파이썬이 너무 강력해서 오히려 더 어려운 문제였다.
24. [232. Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/implement_queue_using_stacks/Solution.py)
    - 스택을 이용해 다음 연산을 지원하는 큐를 구현하라.
        - push(x): 요소 x를 큐 마지막에 삽입한다.
        - pop(): 큐 처음에 있는 요소를 제거한다.
        - peek(): 큐 처음에 있는 요소를 조회한다.
        - empty(): 큐가 비어있는지 여부를 리턴한다.
    - 앞의 문제랑 똑같이 풀면 안풀린다.
25. [622. Design Circular Queue](https://leetcode.com/problems/design-circular-queue/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/design_circular_queue/Solution.py)
    - 원형 큐를 디자인하라.
    - 생각만큼 쉽게 풀리지 않는다. 일단 파이썬엔 배열이 없다...
    - 배열처럼 하기가 까다로웠다.
    - -1을 리턴할 때, if else 문을 쓸 수 있는건 신기한 것 같다.
26. [641. Design Circular Dequeue](https://leetcode.com/problems/design-circular-deque/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/design_circular_deque/Solution.py)
    - 다음 연산을 제공하는 원형 데크를 디자인하라.
        - `MyCircularDeque(k)`: 데크 사이즈를 k로 지정하는 생성자다.
        - `insertFront()`: 데크 처음에 아이템을 추가하고 성공할 경우 True를 리턴한다.
        - `insertLast()`: 데크 마지막에 아이템을 추가하고 성공할 경우 True를 리턴한다.
        - `deleteFront()`: 데크 처음에 아이템을 삭제하고 성공할 경우 True를 리턴한다.
        - `deleteLast()`: 데크 마지막에 아이템을 삭제하고 성공할 경우 True를 리턴한다.
        - `getFront()`: 데크의 첫 번째 아이템을 가져온다. 데크가 비어 있다면 -1을 리턴한다.
        - `getRear()`: 데크의 마지막 아이템을 가져온다. 데크가 비어 있다면 -1을 리턴한다.
        - `isEmpty()`: 데크가 비어 있는지 여부를 판별한다.
        - `isFull()`: 데크가 가득 차 있는지 여부를 판별한다.
    - 파이썬 덱 구현체를 사용했다. 당연히 이렇게 푸는건 아니겠지 -ㅂ-... 문제 조건에 쓰지말라고 되어있었다.
    - 책을 보니까 ListNode를 쓰는데, 정의가 딱히 없어서 없는줄 알았는데, Python으로 해보니까 된다.. 뭐지..
    - 파이썬은 좋긴한데 가끔은 짜증이 난다... ,를 .으로 썼는데 오류가 안나서 뭐가문젠지 한참 찾았다.
    - 그리고 left, right를 굳이 선언하지 않아도 쓸 수 있다는걸 알았다. 신기하다..
27. [23. Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/merge_k_sorted_lists/Solution.py)
    - k개의 정렬된 리스트를 1개의 정렬된 리스트로 병합하라.
    - 파이썬에서 힙을 어떻게 써야할지 모르겠다...
    - 풀이방법만 알면 쉬운 문제라고 한다.
    - 파이썬의 힙은 최소힙으로 구현되어있다고 한다.
    - 이해는 했지만 다시 풀어봐야겠다.
28. [706. Design HashMap](https://leetcode.com/problems/design-hashmap/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/design_hashmap/Solution.py)
    - 다음의 기능을 제공하는 해시맵을 디자인하라.
    - put(key, value): 키, 값을 해시맵에 삽입한다. 만약 이미 존재하는 키라면 업데이트한다.
    - get(key): 키에 해당하는 값을 조회한다. 만약 키가 존재하지 않는다면 -1을 리턴한다.
    - remove(key): 키에 해당하는 키, 값을 해시맵에서 삭제한다.
    - 그냥 k가 곧 list인 배열을 사용했다. 크기는 동일하게 지정했다. 이렇게 구현한 이유는 가장 공간을 많이 먹지만, 가장 속도가 빠름을 예상할 수 있어서다.
    - 해시를 할거라면 아마 사이즈를 지정하고, %연산자를 활용하지 않았을까?
    - default dict를 쓰면 파이썬 중에선 빠른편이다.
    - 책은 해시맵을 직접 구현한다. 해싱은 그냥 모듈라 연산만 한다.
29. [771. Jewels and Stones](https://leetcode.com/problems/jewels-and-stones/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/jewels_and_stones/Solution.py)
    - J는 보석이며, S는 갖고 있는 돌이다. S에는 보석이 몇 개나 있을까? 대소문자는 구분한다.
    - 먼저 요구사항을 보니 문자 하나하나가 종류에 해당하는 것 같다.
    - defaultdict를 활용해야 할 것 같다.
    - 문제 요구사항을 보니 J는 중복되지 않는 문자열인 것 같다.
    - 카운터를 이용했다. 풀이도 카운터를 쓴다. 속도는 32ms
    - 파이써닉한 풀이가 제일 빨랐다. 리스트 컴프리헨션은 참 신기하다.
30. [3. Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/longest_substring_without_repeating_characters/Solution.py)
    - 중복 문자가 없는 가장 긴 부분 문자열의 길이를 리턴하라.
    - 순서대로 탐색하면서 같은 문자가 딕셔너리에 없으면 길이를 증가시키고, 있으면 초기화시켜서 최대 길이를 구한다.
    - 중복된 문자가 등장하지만 다른게 더 긴 edge case가 존재했다. (dvdf)
    - 풀이를 봤는데 뭔말인지 모르겠다. 슬라이딩 윈도우 배우고 다시 풀어보지뭐...
31. [347. Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/top_k_frequent_elements/Solution.py)
    - k번 이상 등장하는 요소를 추출하라.
    - 문제 설명이 이상한듯.. k 순위까지 뽑아내는 듯한 예제 케이스임.
    - Counter의 most_common을 활용해서 풀었다.
    - zip이나 asterisk 얘기가 나오는데 봐도 이해가 안간다. 재미없다.
32. [200. Number of Islands](https://leetcode.com/problems/number-of-islands/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/number_of_islands/Solution.py)
    - 1을 육지로, 0을 물로 가정한 2D 그리드 맵이 주어졌을 때, 섬의 개수를 계산하라.(연결된 1들은 하나로 계산한다.)
    - 뭔가 어떻게 풀면 될지가 명확하지 않다... DFS, BFS 문제를 안풀어봐서 그런 것 같다 ㅠㅠ
    - 방문한 곳을 체크하는 것이 중요한 것 같다. 책의 설명을 확인해가면서 전략을 세웠는데 비슷하게 푼 것 같다.
    - 파이썬에는 함수 안에 함수를 선언할 수 있는 중첩 함수라는 것이 있다. 스코프 때문에 전달해줬던 변수나, self가 사라져서 좋은 것 같다.
33. [17. Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/letter_combinations_of_a_phone_number/Solution.py)
    - 2에서 9까지 숫자가 주어졌을 때 전화 번호로 조합 가능한 모든 문자를 출력하라
    - 문자 조합을 구하는 것이라서 그 숫자로 가능한 문자의 경우들을 조합해서 출력해야 할 것 같다.
    - 그리고 순서가 정해져있어서 쉬운 것 같다.
    - 그냥 가능한 문자들을 죄다 리스트에 넣고 합치는 식으로 하면 될 것 같다.
    - 리스트 컴프리헨션 및 파이썬의 강력함을 느낄 수 있는 문제였다.
34. [46. Permutations](https://leetcode.com/problems/permutations/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/permutations/Solution.py)
    - 서로 다른 정수를 입력받아 가능한 모든 순열을 리턴하라
    - 파이썬의 내장모듈인 itertools를 활용하면 간단하게 풀 수 있다.
    - 참고: https://medium.com/@dltkddud4403/python-%EC%88%9C%EC%97%B4-%EC%A1%B0%ED%95%A9-%EA%B5%AC%ED%98%84-5e496e74621c
    - 재귀를 이용하는 방법도 있다. 단, 파이썬에서는 itertools가 C언어로 되어있어 성능은 더 좋다.
35. [77. Combinations](https://leetcode.com/problems/combinations/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/combinations/Solution.py)
    - 전체 수 n을 입력받아 k개의 조합을 리턴하라.
    - itertools가 성능도 좋고 풀이속도도 빠르다.
    - 재귀를 이용하는 방법을 이해는 해두자.
36. [39. Combination Sum](https://leetcode.com/problems/combination-sum/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/combination_sum/Solution.py)
    - 숫자 집합 candidates를 조합하여 합이 target이 되는 원소를 나열하라. 각 원소는 중복으로 나열 가능하다.
    - 어떻게 만들다보니 통과하는 로직이 되었다.
    - 중복조합은 start 값은 그대로 넘겨주고, for 루프를 돌때 마다 증가시켜주는 구조로 만들면 되는 것 같다.
    - start 값을 없앴더니, 위치만 다른 중복되는 값이 도출되었다.
37. [78. Subsets](https://leetcode.com/problems/subsets/)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/leetcode/subsets/Solution.py)
    - 모든 부분 집합을 리턴하라.
    - 조합 코드를 활용해보려고 했는데, 결과적으로 실패...
    - 풀이를 참조했다.

### [CodeSignal](https://app.codesignal.com/)

1. [firstNotRepeatingCharacter](https://app.codesignal.com/interview-practice/task/uX5iLwhc6L5ckSyNC)
    - 처음으로 중복되지 않는 문자열 찾기
    - Python의 Counter가 이런문제에서 강한 것 같다.
    - 만약 순서보장이 안된다면, list에 append하고 가장 index가 작은 값을 지정하면 될 것 같다.

### 이것이 코딩테스트다

#### 그리디

1. 모험가 길드
    - 문제의 조건은 이해했지만, 시간내에 풀이에 실패했다. 간단한 문제였는데, 잘못 풀이를 선택해서 실패한 것 같다.
2. 곱하기 혹은 더하기
    - 문제의 조건을 이해했고, 풀이와 동일한 코드를 작성했다.
3. 문자열 뒤집기
    - 문제를 잘 이해하지 못했던 것 같다. 이해하기 위해 검색을 통해서 이해했다.

### 프로그래머스

1. [크레인 인형뽑기 게임(2019 카카오 겨울 인턴십)](https://programmers.co.kr/learn/courses/30/lessons/64061)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/programmers/카카오%20겨울%20인턴십(2019)/크레인%20인형뽑기/solution.py)
    - 좀 더 집중하면 잘 풀 수 있었을 듯...
    - 소요시간 1시간
2. [키패드 누르기(2020 카카오 인턴십)](https://programmers.co.kr/learn/courses/30/lessons/67256)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/programmers/카카오%20인턴십(2020)/키패드%20누르기/solution.py)
    - 문제 풀이 자체가 오래 걸린듯
    - 소요시간 30분
3. [비밀지도(2018 카카오 블라인드 채용)](https://programmers.co.kr/learn/courses/30/lessons/17681)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/programmers/카카오%20블라인드%20채용(2018)/비밀지도/solution.py)
    - 파이썬 문법을 몰라서 좀 더 걸렸다.
    - 소요시간 15분
4. [실패율(2019 카카오 블라인드 채용)](https://programmers.co.kr/learn/courses/30/lessons/42889)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/programmers/카카오%20블라인드%20채용(2019)/실패율/solution.py)
    - try excpet를 응용했다. lambda 식을 이용한 정렬 기준 설정을 사용했다.
    - 풀이에 어느정도 만족했다.
    - 소요시간 21분
5. [다트 게임(2018 카카오 블라인드 채용)](https://programmers.co.kr/learn/courses/30/lessons/17682)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/programmers/카카오%20블라인드%20채용(2018)/다트%20게임/solution.py)
    - 파이썬으로 정규식 처리가 아직 미숙해서 엄청 해멨다.
    - 풀이가 썩 맘에 들지 않았다.
    - 소요시간 35분
6. [문자열 압축(2020 카카오 블라인드 채용)](https://programmers.co.kr/learn/courses/30/lessons/60057)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/programmers/카카오%20블라인드%20채용(2020)/문자열%20압축/solution.py)
    - 한 세번째 푸는 것 같은데 풀 때마다 어려운 느낌이다.
    - 경계값 설정을 잘못해줘서 테스트 케이스 오류가 났었다.
    - 소요시간 35분
7. [괄호 변환(2020 카카오 블라인드 채용)](https://programmers.co.kr/learn/courses/30/lessons/60058)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/programmers/카카오%20블라인드%20채용(2020)/괄호%20변환/solution.py)
    - 풀이 실패(30분 소요)
    - 균형잡힌 괄호 문자열 인덱스를 어떻게 잡아야 할지 감이 오지 않았음
    - 문제의 알고리즘을 구현하는데 어려움이 있었음
    - 재귀를 사용해야한다는 것은 알고있었는데, 어떻게 적용할지 막막했던 것 같다.
8. [튜플(2019 카카오 겨울 인턴십)](https://programmers.co.kr/learn/courses/30/lessons/64065)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/programmers/카카오%20겨울%20인턴십(2019)/튜플/solution.py)
    - 파이썬이라 너무 쉬운문제였나..?
    - 정규식으로 걸러내는게 중요했다.
    - 튜플의 순서를 알아내는게 살짝 까다로웠다. (많이 나온 순이라고 함)
    - 소요시간 10분
9. [수식 최대화(2020 카카오 인턴십)](https://programmers.co.kr/learn/courses/30/lessons/67257)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/programmers/카카오%20인턴십(2020)/수식%20최대화/solution.py)
    - 풀이 실패(30분 소요)
    - 정규식으로 접근했는데, 굳이 정규식으로 접근하지 않아도 되었음 (파이썬의 `eval()` 함수가 있어서)
    - 우선순위 매기는 방식은 어쩔 수 없이 일일이 적어줘야 한다.
    - 스택을 사용하는 대신 재귀를 사용한 것에 주목했다.
    - `join(delimiter)` 함수도 유용하게 쓸 수 있다.
    - 풀이를 보니 우선순위의 순서는 크게 중요하지 않은 값이었다. 이 부분만 좀 더 신경썼다면 좋은풀이였을 것 같다.
    - 한 편으로는 내가 너무 우선순위에 집착한 감이 없잖아 있다.
10. [뉴스 클러스터링(2018 카카오 블라인드 채용)](https://programmers.co.kr/learn/courses/30/lessons/17677)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/programmers/카카오%20블라인드%20채용(2018)/뉴스%20클러스터링/solution.py)
    - 정규식과 Counter(중복집합)를 활용하는 문제였다.
    - 합집합을 구할 때, 교집합을 빼는걸 까먹었다.
    - 소요시간 45분
11. [자물쇠와 열쇠(2020 카카오 블라인드 채용)](https://programmers.co.kr/learn/courses/30/lessons/60059)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/programmers/카카오%20블라인드%20채용(2020)/자물쇠와%20열쇠/solution.py)
    - 풀이 실패(20분 풀어보다 접근을 못하겠어서 포기)
    - 구현, 완전탐색 문제
    - 이런 문제에 내가 약한 것 같다. 문제 접근조차 하지 못했다.
    - 시간복잡도를 대략적으로 분석해서 어떻게 접근할지 추론하는 것도 중요한 것 같다.
    - 구현의 아이디어만 생각해낸다면 내용 자체는 굉장히 쉬워진다.
    - 단, 이차원 배열 회전은 스니펫에 저장해두고 사용해야겠다. (이건 어려움)
    - 카카오 1차는 통과할 수 있을까 ㅎㅎ..
12 [기둥과 보 설치(2020 카카오 블라인드 채용)](https://programmers.co.kr/learn/courses/30/lessons/60061)
    - [풀이](https://github.com/ksundong/algorithm-solution/blob/master/pysrc/programmers/카카오%20블라인드%20채용(2020)/기둥과%20보%20설치/solution.py)
    - 풀이 실패(1시간 10분 풀었는데, 테스트케이스는 통과했으나 실패)
    - 시뮬레이션 문제
    - 문제의 조건이 너무 복잡했다. 그리고 구현 복잡도가 상당했다.
    - 그냥 answer에 때려넣는 방식으로 해결하더라... (어쩐지 문제 조건에 맞게 하려면 일반적인 배열로는 안됐다.)
    - 파이썬 들여쓰기와 약타입의 콜라보레이션으로 오류를 못찾겠었다...
