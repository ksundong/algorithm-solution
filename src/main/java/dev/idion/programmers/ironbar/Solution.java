package dev.idion.programmers.ironbar;

public class Solution {
  public int solution(String arrangement) {
    char[] chars = arrangement.replaceAll("\\(\\)", "1").toCharArray();

    int cnt = 0;
    int answer = 0;
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == '(') {
        cnt++;
      }
      if (chars[i] == '1') {
        answer += cnt;
      }
      if (chars[i] == ')') {
        answer++;
        cnt--;
      }
    }
    return answer;
  }
}
