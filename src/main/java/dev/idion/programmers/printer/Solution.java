package dev.idion.programmers.printer;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
  public int solution(int[] priorities, int location) {
    int answer = 1;

    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

    for (int task : priorities) {
      pq.add(task);
    }

    while (!pq.isEmpty()) {
      for (int i = 0; i < priorities.length; i++) {
        if (priorities[i] == pq.peek()) { // 현재 제일 우선순위인 항목
          if (i == location) { // 찾고자 하는 인쇄 작업
            return answer; // answer는 1부터 시작함
          }
          pq.poll();
          answer++; // 아니라면 answer값 증가
        }
      }
    }
    return answer;
  }
}
