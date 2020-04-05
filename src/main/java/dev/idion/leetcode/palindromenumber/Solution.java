package dev.idion.leetcode.palindromenumber;

public class Solution {
    public boolean isPalindrome(int x) {
        boolean result = true;
        String xStr = x + "";
        int xLen = xStr.length();
        for (int i = 0; i < xLen / 2; i++) {
            if (xStr.charAt(i) != xStr.charAt(xLen - 1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
