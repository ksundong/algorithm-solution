package dev.idion.programmers.phonenumberlist;

import java.util.Arrays;

public class Solution {
    public boolean solution(String[] phoneBook) {
        int length = phoneBook.length;
        Arrays.sort(phoneBook);
        for (int i = 0; i < length - 1; i++) {
            if (phoneBook[i + 1].startsWith(phoneBook[i])) return false;
        }
        return true;
    }
}
