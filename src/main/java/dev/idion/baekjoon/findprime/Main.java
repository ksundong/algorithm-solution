package dev.idion.baekjoon.findprime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int size = Integer.parseInt(br.readLine());
    int sum = 0;

    String[] inputs = br.readLine().split(" ");
    int[] nums = new int[size];

    for (int i = 0; i < size; i++) {
      nums[i] = Integer.parseInt(inputs[i]);
    }

    for (int i = 0; i < size; i++) {
      int num = nums[i];
      for (int j = 2; j <= num; j++) {
        if (num == j) {
          sum++;
        }
        if (num % j == 0) {
          break;
        }
      }
    }

    System.out.print(sum);
  }
}
