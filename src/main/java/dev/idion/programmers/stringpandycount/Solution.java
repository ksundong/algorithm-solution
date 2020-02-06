package dev.idion.programmers.stringpandycount;

public class Solution {
    boolean solution(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'p' || c == 'P') count++;
            if (c == 'y' || c == 'Y') count--;
        }
        return count == 0;
    }
}
