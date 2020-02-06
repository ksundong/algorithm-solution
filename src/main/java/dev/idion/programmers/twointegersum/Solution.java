package dev.idion.programmers.twointegersum;

public class Solution {
    public long solution(int a, int b) {
        return gauss(Math.min(a, b), Math.max(a, b));
    }

    private long gauss(int min, int max) {
        return ((long) (min + max) * (max - min + 1) / 2);
    }
}
