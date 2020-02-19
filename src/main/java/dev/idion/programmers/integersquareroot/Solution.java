package dev.idion.programmers.integersquareroot;

public class Solution {
    public long solution(long n) {
        long sqrt = (long) Math.sqrt(n);
        if ((sqrt * sqrt) == n) {
            sqrt++;
            return sqrt * sqrt;
        }
        return -1;
    }
}
