package dev.idion.programmers.primenumber;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int n2 = n + 1;
        int[] nArr = new int[n2];
        for (int i = 2; i < n2; i++) {
            nArr[i] = i;
        }
        for (int i = 2; i < n2; i++) {
            if (nArr[i] == 0) continue;
            for (int j = 2 * i; j < n2; j += i) {
                nArr[j] = 0;
            }
        }
        for (int i : nArr) {
            if (i != 0) answer++;
        }
        return answer;
    }
}
