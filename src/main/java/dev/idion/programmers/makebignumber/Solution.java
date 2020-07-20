package dev.idion.programmers.makebignumber;

public class Solution {
  public String solution(String number, int k) {
    StringBuilder sb = new StringBuilder(number); // StringBuilder 초기화

    int length = sb.length() - 1;
    int idx = length; // 최초 위치 지정
    for (int i = 0; i < k; i++) { // 제거 횟수만큼 반복
      for (int j = 0; j < length; j++) { // 처음부터 순회
        if (sb.charAt(j) < sb.charAt(j + 1)) { // 현재 선택된 인덱스가 더 작다면
          idx = j; // 제거할 인덱스 지정
          break;
        }
      }

      sb.deleteCharAt(idx); // 제거
    }

    return sb.toString();
  }
}
