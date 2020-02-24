package dev.idion.programmers.getaverage;

public class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return (double) sum / arr.length;
    }
}
