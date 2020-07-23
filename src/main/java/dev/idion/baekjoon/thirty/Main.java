package dev.idion.baekjoon.thirty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    int length = s.length();
    int[] nums = new int[length];
    String[] strs = s.split("");

    for (int i = 0; i < length; i++) {
      nums[i] = Integer.parseInt(strs[i]);
    }

    Arrays.sort(nums);

    int sum = 0;
    StringBuilder sb = new StringBuilder();

    if (nums[0] != 0) {
      sb = new StringBuilder("-1");
    } else {
      for (int i = length - 1; i >= 0; i--) {
        int num = nums[i];
        sum += num;
        sb.append(num);
      }

      if (sum % 3 != 0) {
        sb = new StringBuilder("-1");
      }
    }

    System.out.print(sb.toString());
  }
}
