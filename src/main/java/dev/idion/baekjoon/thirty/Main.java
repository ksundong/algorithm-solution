package dev.idion.baekjoon.thirty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    int[] nums = new int[10];

    int sum = 0;
    for (int i = 0; i < s.length(); i++) {
      int num = s.charAt(i) - '0';
      sum += num;
      nums[num]++;
    }

    StringBuilder sb = new StringBuilder();
    if (nums[0] == 0 || sum % 3 != 0) {
      sb = new StringBuilder("-1");
    } else {
      for (int i = 9; i >= 0; i--) {
        for (int j = 0; j < nums[i]; j++) {
          sb.append(i);
        }
      }
    }

    System.out.print(sb);
  }
}
