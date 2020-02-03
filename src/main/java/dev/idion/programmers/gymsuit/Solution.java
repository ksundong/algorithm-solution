package dev.idion.programmers.gymsuit;

public class Solution {
    // 전체 학생의 수 n, 도난당한 학생의 배열 lost, 여벌의 체육복을 가진 학생의 배열 reserve
    public int solution(int n, int[] lost, int[] reserve) {
        n -= lost.length;
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j] - 1 || lost[i] == reserve[j] || lost[i] == reserve[j] + 1) {
                    n++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return n;
    }
}
