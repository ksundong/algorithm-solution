package dev.idion.baekjoon.coinzero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] inputs = br.readLine().split(" ");
    int size = Integer.parseInt(inputs[0]);
    int value = Integer.parseInt(inputs[1]);
    int[] coins = new int[size];
    int count = 0;

    // 역순으로 집어넣는다.
    for (int i = size - 1; i >= 0; i--) {
      coins[i] = Integer.parseInt(br.readLine());
    }

    while (value != 0) {
      for (int i = 0; i < size; i++) {
        count += value / coins[i];
        value = value % coins[i];
      }
    }

    System.out.print(count);
    br.close();
  }
}
