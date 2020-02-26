package dev.idion.programmers.maskingphonenumber;

public class Solution {
    public String solution(String phoneNumber) {
        int size = phoneNumber.length() - 4;
        char[] chars = phoneNumber.toCharArray();
        for (int i = 0; i < size; i++) {
            chars[i] = '*';
        }
        return String.copyValueOf(chars);
    }
}
