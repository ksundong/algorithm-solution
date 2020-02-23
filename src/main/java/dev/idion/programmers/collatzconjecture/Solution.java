package dev.idion.programmers.collatzconjecture;

public class Solution {
    public int solution(int num) {
        int answer = 0;
        long longNum = num;

        while (longNum != 1) {
            longNum = longNum % 2 == 0 ? longNum / 2 : longNum * 3 + 1;
            answer++;
            if (answer == 500) {
                return -1;
            }
        }

        return answer;
    }
}
