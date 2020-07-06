package dev.idion.programmers.featuredevelop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
  public int[] solution(int[] progresses, int[] speeds) {
    List<Integer> answerList = new ArrayList<>();
    Queue<Task> taskQueue = new LinkedList<>();

    for (int i = 0; i < progresses.length; i++) {
      taskQueue.add(new Task(progresses[i], speeds[i]));
    }

    while (!taskQueue.isEmpty()) {
      for (Task task : taskQueue) {
        task.increaseProgress();
      }

      int tmp = 0;
      while (!taskQueue.isEmpty() && taskQueue.peek().isCompleted()) {
        taskQueue.poll();
        tmp++;
      }
      if (tmp != 0) {
        answerList.add(tmp);
      }
    }

    int[] answer = new int[answerList.size()];
    for (int i = 0; i < answer.length; i++) {
      answer[i] = answerList.get(i);
    }

    return answer;
  }

  static class Task {
    private int progress;
    private final int speed;

    public Task(int progress, int speed) {
      this.progress = progress;
      this.speed = speed;
    }

    public boolean isCompleted() {
      return progress > 99;
    }

    public void increaseProgress() {
      this.progress += this.speed;
    }
  }
}
