package dev.idion.programmers.integerdesc;

import java.util.Arrays;

public class Solution {
    public long solution(long n) {
        int size = Long.toString(n).length();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            int rest = (int) (n % 10);
            nums[i] = rest;
            n /= 10;
        }
        Arrays.sort(nums);
        long answer = 0;
        for (int i = size - 1; i >= 0; i--) {
            answer *= 10;
            answer += nums[i];
        }
        return answer;
    }
}
