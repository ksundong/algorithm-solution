package dev.idion.programmers.finesquare;

public class Solution {
  public long solution(int w, int h) {
    int gcf = 0;
    for (int i = 1; i <= Math.max(w, h); i++) {
      if (w % i == 0 && h % i == 0) {
        gcf = i;
      }
    }
    return (long) w * h - (w + h - gcf);
  }
}
