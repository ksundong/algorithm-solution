package dev.idion.baekjoon.changecash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int count = 0;
    int change = 1000 - Integer.parseInt(br.readLine());

    while (change > 0) {
      if (change / 500 > 0) {
        change -= 500;
        count++;
      } else if (change / 100 > 0) {
        change -= 100;
        count++;
      } else if (change / 50 > 0) {
        change -= 50;
        count++;
      } else if (change / 10 > 0) {
        change -= 10;
        count++;
      } else if (change / 5 > 0) {
        change -= 5;
        count++;
      } else {
        count += change;
        change = 0;
      }
    }

    System.out.print(count);

    br.close();
  }
}
