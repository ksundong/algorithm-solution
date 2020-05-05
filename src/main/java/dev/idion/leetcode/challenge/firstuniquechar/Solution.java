package dev.idion.leetcode.challenge.firstuniquechar;

public class Solution {
    public int firstUniqChar(String s) {
        int[] charCnt = new int[26];
        char[] chars = s.toCharArray();
        for (char c : chars) {
            charCnt[c - 97] += 1;
        }

        int lastIndex = Integer.MAX_VALUE;
        for (int i = 0; i < charCnt.length; i++) {
            if (charCnt[i] == 1) {
                lastIndex = Math.min(lastIndex, s.indexOf(i + 97));
            }
        }
        return lastIndex == Integer.MAX_VALUE ? -1 : lastIndex;
    }
}
