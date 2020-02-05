package dev.idion.programmers.noduplicatenumber;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[1000000];
        int tmp = -1;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != tmp) {
                answer[count] = arr[i];
                count++;
            }
            tmp = arr[i];
        }
        answer = Arrays.copyOf(answer, count);
        return answer;
    }
}
