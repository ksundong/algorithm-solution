package dev.idion.programmers.stringdescendingorder;

import java.util.Arrays;

public class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new StringBuilder(new String(chars))
                .reverse()
                .toString();
    }
}
