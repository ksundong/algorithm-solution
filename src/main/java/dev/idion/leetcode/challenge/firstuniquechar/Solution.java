package dev.idion.leetcode.challenge.firstuniquechar;

public class Solution {
    public int firstUniqChar(String s) {
        int lastIndex = Integer.MAX_VALUE;

        for (int c = 'a'; c <= 'z'; c++) {
            int idx = s.indexOf(c);

            if (idx != -1 && idx == s.lastIndexOf(c)) {
                lastIndex = Math.min(lastIndex, idx);
            }
        }

        return lastIndex == Integer.MAX_VALUE ? -1 : lastIndex;
    }
}
