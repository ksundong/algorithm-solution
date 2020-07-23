package dev.idion.baekjoon.meetingroom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int size = Integer.parseInt(br.readLine());
    Schedule[] schedules = new Schedule[size];
    int count = 0;

    for (int i = 0; i < size; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      schedules[i] =
          new Schedule(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
    }

    Arrays.sort(schedules);

    Schedule selected = null;
    for (int i = 0; i < size; i++) {
      if (selected == null || schedules[i].start >= selected.end) {
        selected = schedules[i];
        count++;
      }
    }

    System.out.print(count);
    br.close();
  }

  private static class Schedule implements Comparable<Schedule>{
    private int start;
    private int end;

    public Schedule(int start, int end) {
      this.start = start;
      this.end = end;
    }

    @Override
    public int compareTo(Schedule o) {
      return this.end - o.end == 0 ? this.start - o.start : this.end - o.end;
    }
  }
}
