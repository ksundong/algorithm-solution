package dev.idion.programmers.joystick;

public class Solution {
  public int solution(String name) {
    int answer = 0;
    char[] chars = name.toCharArray();
    int length = chars.length;

    // 전체 위 아래 조작은 그냥 더해주면 됨.
    for (char aChar : chars) {
      answer += Math.min('Z' + 1 - aChar, aChar - 'A');
    }

    // 최소 이동거리를 구해야 함.
    int min = length - 1; // 끝까지 쭉 가는 경우
    for (int i = 0; i < length; i++) {
      if (chars[i] != 'A') {
        int next = i + 1;
        while (next < length && chars[next] == 'A') {
          next++;
        }

        min = Math.min(min, 2 * i + length - next); // A가 나올 때 까지 i까지 우측이동 좌측이동해서 2 * i 임.
      }
    }

    return answer + min;
  }
}
