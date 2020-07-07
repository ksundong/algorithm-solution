package dev.idion.programmers.stockprice;

public class Solution {
  public int[] solution(int[] prices) {
    int length = prices.length;
    int[] answer = new int[length];

    for (int i = 0; i < length; i++) {
      int cnt = 0;
      for (int j = i + 1; j < length; j++) {
        cnt++;
        if (prices[j] < prices[i]) {
          break;
        }
      }
      answer[i] = cnt;
    }

    return answer;
  }
}
