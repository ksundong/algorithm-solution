package dev.idion.baekjoon.hansu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int input = Integer.parseInt(br.readLine());
    int count = 0;
    for (int i = 0; i < input; i++) {
      if (isHansu(i + 1)) {
        count++;
      }
    }
    System.out.print(count);
  }

  public static boolean isHansu(int num) {
    if (num < 100) {
      return true;
    }
    if (num == 1000) {
      return false;
    }
    int first = num / 100;
    int second = num % 100 / 10;
    int third = num % 10;

    return first - second == second - third;
  }
}
