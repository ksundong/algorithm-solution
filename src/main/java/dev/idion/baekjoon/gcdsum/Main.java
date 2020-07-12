package dev.idion.baekjoon.gcdsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int repeat = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < repeat; i++) {
      String[] inputs = br.readLine().split(" ");
      int size = Integer.parseInt(inputs[0]);
      int[] input = new int[size];

      for (int j = 0; j < size; j++) {
        input[j] = Integer.parseInt(inputs[j + 1]);
      }

      long sum = 0;
      for (int j = 0; j < size; j++) {
        for (int k = j + 1; k < size; k++) {
          int max = Math.max(input[j], input[k]);
          int min = Math.min(input[j], input[k]);
          sum += gcd(max, min);
        }
      }

      sb.append(sum).append("\n");
    }

    System.out.print(sb.deleteCharAt(sb.lastIndexOf("\n")).toString());
  }

  public static int gcd(int p, int q) {
    if (q == 0) {
      return p;
    }
    return gcd(q, p % q);
  }
}
