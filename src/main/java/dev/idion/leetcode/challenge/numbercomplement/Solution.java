package dev.idion.leetcode.challenge.numbercomplement;

public class Solution {
    // 보수를 구하는 문제
    public int findComplement(int num) {
        // 0은 특이 케이스임
        if (num == 0) {
            return 1;
        }
        int complement = 0;
        int cnt = 0;

        while (num > 0) {
            // 마지막 비트가 0이면 1임
            if ((num & 1) == 0) {
                complement += (1 << cnt); // 1을 cnt만큼 왼쪽 비트연산 한 값(1,2,4...)
            }

            num = num >> 1; // num을 1만큼 오른쪽 비트연산한 값을 num에 저장
            cnt++;
        }

        return complement;
    }
}
