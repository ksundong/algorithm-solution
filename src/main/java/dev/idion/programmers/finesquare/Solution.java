package dev.idion.programmers.finesquare;

public class Solution {
  public long solution(int w, int h) {
    return (long) w * h - (w + h - gcd(w, h));
  }

  public int gcd(int p, int q) {
    if (q == 0) {
      return p;
    }
    return gcd(q, p % q);
  }
}
