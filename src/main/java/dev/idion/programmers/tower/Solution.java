package dev.idion.programmers.tower;

public class Solution {

  public int[] solution(int[] heights) {
    int length = heights.length;
    int[] answer = new int[length];

    for (int i = length - 1; i >= 0; i--) {
      for (int j = i - 1; j >= 0; j--) {
        if (heights[j] > heights[i]) {
          answer[i] = j + 1;
          break;
        }
      }

    }
    return answer;
  }
}
