package dev.idion.programmers.dividingnumberarray;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> dividingArray = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) dividingArray.add(arr[i]);
        }
        if (dividingArray.isEmpty()) return new int[]{-1};

        int[] answer = new int[dividingArray.size()];
        for (int i = 0; i < dividingArray.size(); i++) {
            answer[i] = dividingArray.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
