package dev.idion.leetcode.challenge.ransomnote;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) { // magazine이 부족하면 당연히 불가
            return false;
        }

        int[] caps = new int[26]; // caps는 마지막으로 탐색된 c의 위치를 저장
        for (char c : ransomNote.toCharArray()) {
            int index = magazine.indexOf(c, caps[c - 97]); // c가 magazine에 존재하는지 확인.
            if (index == -1) { // 못찾으면 false
                return false;
            }
            caps[c - 97] = index + 1; // 마지막으로 탐색된 위치 다음을 저장
        }
        return true;
    }
}
