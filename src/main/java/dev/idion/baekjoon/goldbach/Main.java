package dev.idion.baekjoon.goldbach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int num = Integer.parseInt(br.readLine());
    int max = 1_000_000;
    boolean[] primeArr = getPrimeArray(max);

    int a;
    int b;
    while (num != 0) {
      sb.append(num).append(" = ");
      for(int i = 0; i < num; i++) {
        if (primeArr[i] && primeArr[num - i]) {
          a = i;
          b = num - i;
          sb.append(a).append(" + ").append(b).append("\n");
          break;
        }
        if (i == max - 1) {
          sb.append("Goldbach's conjecture is wrong.\n");
        }
      }

      num = Integer.parseInt(br.readLine());
    }
    System.out.print(sb.deleteCharAt(sb.lastIndexOf("\n")).toString());
  }

  public static boolean[] getPrimeArray(int n) {
    boolean[] arr = new boolean[n + 1];

    for(int i = 2; i <= n; i++) {
      arr[i] = true;
    }

    for (int i = 2; (i * i) <= n; i++) { // 최적화(sqrt를 안쓰기 위함)
      if (arr[i]) {
        for(int j = (i * i); j <= n; j += i) { // i * i 아래는 다 처리되었음 배수만 빼기위해 += 사용
          arr[j] = false;
        }
      }
    }

    return arr;
  }
}
