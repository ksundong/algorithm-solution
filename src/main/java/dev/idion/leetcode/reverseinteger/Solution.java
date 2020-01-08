package dev.idion.leetcode.reverseinteger;

public class Solution {
    public int reverse(int x) {
        int reversedX = 0;
        int digit = 10;

        while (x != 0) {
            int rest = x % digit;
            x /= digit;
            if (reversedX > Integer.MAX_VALUE / digit || reversedX < Integer.MIN_VALUE / digit) {
                return 0;
            }
            reversedX = reversedX * digit + rest;
        }

        return reversedX;
    }
}
