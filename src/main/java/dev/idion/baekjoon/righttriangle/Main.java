package dev.idion.baekjoon.righttriangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    while (true) {
      String in = br.readLine();
      if (in.equals("0 0 0")) {
        break;
      }
      sb.append(isRightTriangle(in) ? "right" : "wrong").append("\n");
    }
    System.out.print(sb.toString());
  }

  public static boolean isRightTriangle(String in) {
    String[] lineStr = in.split(" ");
    int length = lineStr.length;
    int[] line = new int[length];

    for (int i = 0; i < length; i++) {
      line[i] = Integer.parseInt(lineStr[i]);
    }

    Arrays.sort(line);
    return (line[2] * line[2]) == (line[0] * line[0]) + (line[1] * line[1]);
  }
}
