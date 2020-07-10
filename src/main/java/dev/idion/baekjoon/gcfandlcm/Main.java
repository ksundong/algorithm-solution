package dev.idion.baekjoon.gcfandlcm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] inputs = br.readLine().split(" ");
    int length = inputs.length;
    int[] nums = new int[length];

    for (int i = 0; i < length; i++) {
      nums[i] = Integer.parseInt(inputs[i]);
    }

    Arrays.sort(nums); // 정렬시 작은 수가 앞으로 온다.
    int gcf = gcd(nums[1], nums[0]);
    int lcm = nums[0] * nums[1] / gcf;

    System.out.print(gcf + "\n" + lcm);
  }

  public static int gcd(int p, int q) {
    if (q == 0) {
      return p;
    }
    return gcd(q, p % q);
  }
}
