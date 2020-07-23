package dev.idion.baekjoon.rope;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int size = Integer.parseInt(br.readLine());
    int[] ropes = new int[size];

    for (int i = 0; i < size; i++) {
      ropes[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(ropes);

    int max = 0;
    for (int i = 0; i < size; i++) { // 가장 짧은 로프의 길이 * 분산되는 무게
      max = Math.max(max, ropes[i] * (size - i));
    }
    System.out.print(max);
  }
}
