package dev.idion.programmers.naturalnumberarray;

public class Solution {
    public int[] solution(long n) {
        int count = 0;
        long tmp = n;
        while (tmp > 0) {
            count++;
            tmp /= 10;
        }

        int[] answer = new int[count];
        for (int i = 0; i < count; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }
        return answer;
    }
}
