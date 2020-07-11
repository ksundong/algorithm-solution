package dev.idion.baekjoon.lcm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int repeat = Integer.parseInt(br.readLine());

    for (int i = 0; i < repeat; i++) {
      String[] inputs = br.readLine().split(" ");
      int length = inputs.length;
      int[] nums = new int[length];

      for (int j = 0; j < length; j++) {
        nums[j] = Integer.parseInt(inputs[j]);
      }

      Arrays.sort(nums); // 정렬시 작은 수가 앞으로 온다.
      sb.append(nums[0] * nums[1] / gcd(nums[1], nums[0])).append("\n");
    }

    System.out.print(sb.deleteCharAt(sb.lastIndexOf("\n")));
  }

  public static int gcd(int p, int q) {
    if (q == 0) {
      return p;
    }
    return gcd(q, p % q);
  }
}
