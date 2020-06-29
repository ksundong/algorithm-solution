package dev.idion.baekjoon.fourthpoint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] xArr = new int[3];
    int[] yArr = new int[3];
    int x, y;

    for (int i = 0; i < 3; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      xArr[i] = Integer.parseInt(st.nextToken());
      yArr[i] = Integer.parseInt(st.nextToken());
    }

    x = xArr[0] == xArr[1] ? xArr[2] : (xArr[0] == xArr[2] ? xArr[1] : xArr[0]);
    y = yArr[0] == yArr[1] ? yArr[2] : (yArr[0] == yArr[2] ? yArr[1] : yArr[0]);

    System.out.print(x + " " + y);
  }
}
