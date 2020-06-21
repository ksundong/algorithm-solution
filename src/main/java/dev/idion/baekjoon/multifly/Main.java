package dev.idion.baekjoon.multifly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num1 = Integer.parseInt(br.readLine());
    String[] numStr = br.readLine().split("");

    int a = num1 * Integer.parseInt(numStr[2]);
    int b = num1 * Integer.parseInt(numStr[1]);
    int c = num1 * Integer.parseInt(numStr[0]);

    System.out.print(a + "\n" + b + "\n" + c + "\n" + (a + (10 * b) + (100 * c)));
  }
}
