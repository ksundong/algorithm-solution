package dev.idion.programmers.weirdstring;

public class Solution {
    public String solution(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int len = chars.length;
        int cnt = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] == ' ') {
                cnt = 0;
                continue;
            }
            if (cnt % 2 == 0) {
                chars[i] = (char) (chars[i] - 32);
            }
            cnt++;
        }
        return String.copyValueOf(chars);
    }
}
