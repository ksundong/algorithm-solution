package dev.idion.programmers.phonenumberlist;

public class Solution {
    public boolean solution(String[] phoneBook) {
        int length = phoneBook.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (phoneBook[i].startsWith(phoneBook[j]) || phoneBook[j].startsWith(phoneBook[i])) return false;
            }
        }
        return true;
    }
}
