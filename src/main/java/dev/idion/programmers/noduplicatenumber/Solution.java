package dev.idion.programmers.noduplicatenumber;

public class Solution {
    public int[] solution(int[] arr) {
        int tmp = -1;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != tmp) {
                count++;
            }
            tmp = arr[i];
        }

        tmp = -1;
        int tempCount = 0;
        int[] answer = new int[count];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != tmp) {
                answer[tempCount] = arr[i];
                tempCount++;
            }
            tmp = arr[i];
        }
        return answer;
    }
}
