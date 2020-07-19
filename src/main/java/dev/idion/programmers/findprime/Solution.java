package dev.idion.programmers.findprime;

import java.util.HashSet;
import java.util.Set;

public class Solution {
  public int solution(String numbers) {
    char[] nArr = numbers.toCharArray();
    int length = nArr.length;
    boolean[] primeArray = getPrimeArray(powTen(length));
    int answer = 0;
    Set<Integer> hs = new HashSet<>();

    for (int i = 0; i <= length; i++) {
      permutation(nArr, 0, length, i, hs);
    }

    for (Integer h : hs) {
      if (primeArray[h]) {
        answer++;
      }
    }

    return answer;
  }

  public void permutation(char[] arr, int depth, int max, int cur, Set<Integer> ps) {
    if (depth == cur) {
      ps.add(makeNumber(arr, cur));
      return;
    }

    for (int i = depth; i < max; i++) {
      swap(arr, i, depth);
      permutation(arr, depth + 1, max, cur, ps);
      swap(arr, i, depth);
    }
  }

  public int makeNumber(char[] arr, int cur) {
    int result = 0;

    for(int i = 0; i < cur; i++) {
      result += Character.getNumericValue(arr[i]) * powTen(i);
    }

    return result;
  }

  public void swap(char[] arr, int i, int depth) {
    char temp = arr[i];
    arr[i] = arr[depth];
    arr[depth] = temp;
  }

  public int powTen(int pow) {
    int res = 1;

    for (int i = 0; i < pow; i++) { // 1자리면 10까지여야 함
      res *= 10;
    }

    return res;
  }

  public boolean[] getPrimeArray(int n) {
    boolean[] arr = new boolean[n + 1];

    for(int i = 2; i <= n; i++) {
      arr[i] = true;
    }

    for (int i = 2; (i * i) <= n; i++) { // 최적화(sqrt를 안쓰기 위함)
      if (arr[i]) {
        for(int j = (i * i); j <= n; j += i) { // i * i 아래는 다 처리되었음 배수만 빼기위해 += 사용
          arr[j] = false;
        }
      }
    }

    return arr;
  }
}
