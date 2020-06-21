package dev.idion.baekjoon.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] numStr = br.readLine().split(" ");

    int a = Integer.parseInt(numStr[0]);
    int b = Integer.parseInt(numStr[1]);
    int c = Integer.parseInt(numStr[2]);

    int first = (a + b) % c;
    int second = ((a % c) + (b % c)) % c;
    int third = (a * b) % c;
    int fourth = ((a % c) * (b % c)) % c;
    String sb = first + "\n" + second + "\n" + third + "\n" + fourth;
    System.out.print(sb);
  }
}
