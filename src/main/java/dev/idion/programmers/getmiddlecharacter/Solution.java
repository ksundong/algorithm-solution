package dev.idion.programmers.getmiddlecharacter;

public class Solution {
    public String solution(String s) {
        int length = s.length();
        int halfLength = (length - 1) / 2;
        int endIndex = length / 2 + 1;
        return s.substring(halfLength, endIndex);
    }
}
