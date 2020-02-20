package dev.idion.programmers.deleteminnum;

public class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        if (length == 1) return new int[]{-1};

        int minVal = arr[0];
        for (int value : arr) {
            if (minVal > value) {
                minVal = value;
            }
        }

        int[] answer = new int[length - 1];
        int idx = 0;
        for (int value : arr) {
            if (value != minVal) {
                answer[idx] = value;
                idx++;
            }
        }
        return answer;
    }
}
