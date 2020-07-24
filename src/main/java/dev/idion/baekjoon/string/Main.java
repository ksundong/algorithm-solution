package dev.idion.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strs = br.readLine().split(" ");

    int min = Integer.MAX_VALUE; // min값이 선택되도록 하기 위함
    int sLen0 = strs[0].length();
    int sLen1 = strs[1].length();
    int subLen = sLen1 - sLen0;

    // 두 값의 길이 차이만큼 반복
    for (int i = 0; i <= subLen; i++) {
      int cnt = 0;
      for (int j = 0; j < sLen0; j++) { // A의 길이만큼 반복(순서대로 비교)
        if (strs[0].charAt(j) != strs[1].charAt(j + i)) {
          cnt++;
        }
      }
      min = Math.min(cnt, min);
    }

    System.out.print(min);
  }
}
