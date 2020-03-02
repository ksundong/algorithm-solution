package dev.idion.programmers.secretmap;

public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = decrypt(n, arr1[i], arr2[i]);
        }

        return answer;
    }

    private String decrypt(int repeat, int x, int y) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeat; i++) {
            sb.append((x % 2 == 0 && y % 2 == 0) ? " " : "#");
            x /= 2;
            y /= 2;
        }

        return sb.reverse().toString();
    }
}
