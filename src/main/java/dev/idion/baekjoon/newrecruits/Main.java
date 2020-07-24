package dev.idion.baekjoon.newrecruits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int repeat = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < repeat; i++) { // 입력 개수만큼 반복
      int count = Integer.parseInt(br.readLine()); // 인원 수
      Recruit[] recruits = new Recruit[count];

      for (int j = 0; j < count; j++) { // 지원자 생성
        StringTokenizer st = new StringTokenizer(br.readLine());
        recruits[j] = new Recruit(st.nextToken(), st.nextToken());
      }
      Arrays.sort(recruits); // 서류 순위에 따라 정렬

      int pass = 1;
      int minInterviewRank = recruits[0].interviewRank;
      Recruit cur;
      for (int j = 1; j < count; j++) {
        cur = recruits[j];
        if (cur.interviewRank < minInterviewRank) { // 인터뷰 순위가 현재까지 나온 인터뷰 순위보다 높다면
          pass++; // 합격
          minInterviewRank = cur.interviewRank;
        }
      }

      sb.append(pass).append("\n");
    }

    System.out.print(sb.deleteCharAt(sb.lastIndexOf("\n")));
  }

  private static class Recruit implements Comparable<Recruit> {

    private int paperRank;
    private int interviewRank;

    public Recruit(String paper, String interview) {
      this.paperRank = Integer.parseInt(paper);
      this.interviewRank = Integer.parseInt(interview);
    }

    @Override
    public int compareTo(Recruit o) {
      return this.paperRank - o.paperRank;
    }
  }
}
