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
