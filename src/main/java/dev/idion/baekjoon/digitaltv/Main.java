package dev.idion.baekjoon.digitaltv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int size = Integer.parseInt(br.readLine());
    String[] kbs = {"KBS1", "KBS2"};
    StringBuilder sb = new StringBuilder();

    int k1 = -1;
    int k2 = -1;

    for (int i = 0; i < size; i++) {
      String s = br.readLine();
      if (s.equals(kbs[0])) {
        k1 = i;
      } else if (s.equals(kbs[1])) {
        k2 = i;
      }
      if (k1 != -1 && k2 != -1) {
        break;
      }
    }

    int inOrder = k1 > k2 ? 1 : 0; // k1이 더 뒤에 있으면 k2가 뒤로 이동하므로 한 번 더 움직임.
    for (int i = 0; i < k1; i++) {
      sb.append(1);
    }

    for (int i = 0; i < k1; i++) {
      sb.append(4);
    }

    for (int i = 0; i < k2 + inOrder; i++) {
      sb.append(1);
    }

    for (int i = 0; i < k2 + inOrder - 1; i++) {
      sb.append(4);
    }

    System.out.print(sb.toString());
    br.close();
  }
}
