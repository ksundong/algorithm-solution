package dev.idion.programmers.sumofprocession;

public class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int length1 = arr1.length;
        int[][] answer = new int[length1][];
        for (int i = 0; i < length1; i++) {
            int length2 = arr1[i].length;
            answer[i] = new int[length2];
            for (int j = 0; j < length2; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
