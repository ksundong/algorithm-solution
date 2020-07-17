package dev.idion.programmers.coloringbook;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
  public int[] solution(int m, int n, int[][] picture) {
    int[] answer = new int[2];
    boolean[][] visited = new boolean[m][n]; // 방문여부를 판단하는 이중배열
    Deque<Integer> xs = new LinkedList<>(); // 앞으로 방문해야할 x 좌표
    Deque<Integer> ys = new LinkedList<>(); // 앞으로 방문해야할 y 좌표

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        int count = 0;

        if (picture[i][j] > 0 && !visited[i][j]) {
          checkVisit(visited, xs, ys, i, j);
          count++;
          answer[0]++;
        }

        // 반복을하는 이유는 같은 영역의 크기를 구하기 위함.
        while (!xs.isEmpty()) { // 어차피 둘다 pop을 하기 때문에 하나만 체크해도 된다.
          int x = xs.pop();
          int y = ys.pop();

          if (x > 0 && picture[x - 1][y] == picture[i][j] && !visited[x - 1][y]) { // 좌측
            checkVisit(visited, xs, ys, x - 1, y);
            count++;
          }
          if (y > 0 && picture[x][y - 1] == picture[i][j] && !visited[x][y - 1]) { // 상단
            checkVisit(visited, xs, ys, x, y - 1);
            count++;
          }
          if (x < m - 1 && picture[x + 1][y] == picture[i][j] && !visited[x + 1][y]) { // 우측
            checkVisit(visited, xs, ys, x + 1, y);
            count++;
          }
          if (y < n - 1 && picture[x][y + 1] == picture[i][j] && !visited[x][y + 1]) { // 하단
            checkVisit(visited, xs, ys, x, y + 1);
            count++;
          }
        }
        answer[1] = Math.max(answer[1], count);
      }
    }

    return answer;
  }

  // 방문할 좌표를 추가하고, 방문했음을 체크한다.
  // 방문할 좌표를 추가하는 것은, 그 주변 영역을 체크하기 위함입니다.
  private void checkVisit(boolean[][] visited, Deque<Integer> xs, Deque<Integer> ys, int x, int y) {
    xs.add(x);
    ys.add(y);
    visited[x][y] = true;
  }
}
