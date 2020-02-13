package dev.idion.programmers.caesarcipher;

public class Solution {
    public String solution(String s, int n) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        for (int i = 0; i < len; i++) {
            char c = cs[i];
            if (c != ' ') {
                char a = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) (a + (c + n - a) % 26); // c + n - a는 변화한 값을 체크하기 위함
            }
            cs[i] = c;
        }
        return String.copyValueOf(cs);
    }
}
