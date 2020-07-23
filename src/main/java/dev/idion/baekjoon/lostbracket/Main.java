package dev.idion.baekjoon.lostbracket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] chars = br.readLine().toCharArray();

    StringBuilder sb = new StringBuilder();
    int sum = 0;
    boolean flag = true;
    for (char aChar : chars) {
      if (aChar != '+' && aChar != '-') {
        sb.append(aChar);
      } else {
        int num = Integer.parseInt(sb.toString());
        sum += flag ? num : -num;
        if (aChar == '-') {
          flag = false;
        }
        sb = new StringBuilder();
      }
    }

    int num = Integer.parseInt(sb.toString());
    sum += flag ? num : -num;
    System.out.print(sum);
  }
}
