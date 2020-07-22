package dev.idion.baekjoon.atm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int size = Integer.parseInt(br.readLine());
    int[] inputs = new int[size];
    long answer = 0;
    long tmp = 0;

    String[] inputStrs = br.readLine().split(" ");
    for (int i = 0; i < size; i++) {
      inputs[i] = Integer.parseInt(inputStrs[i]);
    }

    Arrays.sort(inputs);
    for (int input : inputs) {
      tmp += input;
      answer += tmp;
    }

    System.out.print(answer);
    br.close();
  }
}
