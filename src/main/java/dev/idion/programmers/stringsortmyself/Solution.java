package dev.idion.programmers.stringsortmyself;

import java.util.Arrays;

public class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (o1, o2) -> {
            char x = o1.charAt(n);
            char y = o2.charAt(n);
            if (x == y) {
                return o1.compareTo(o2);
            }
            return Character.compare(x, y);
        });
        return strings;
    }
}
