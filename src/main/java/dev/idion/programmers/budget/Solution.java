package dev.idion.programmers.budget;

import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int count = 0;
        for (int value : d) {
            budget -= value;
            if (budget < 0) {
                break;
            }
            count++;
        }
        return count;
    }
}
