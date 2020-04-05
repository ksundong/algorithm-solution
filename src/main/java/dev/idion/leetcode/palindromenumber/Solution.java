package dev.idion.leetcode.palindromenumber;

public class Solution {
    public boolean isPalindrome(int x) {
        // x가 음수인 경우 팰린드롬이 아님, 0이 아닌경우, 나머지가 0이면 팰린드롬이 아님.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revert = 0;
        while (x > revert) {
            revert = revert * 10 + x % 10;
            x /= 10;
        }

        // 뒤의 조건은 홀수개의 자릿수 일 때를 위한 코드
        return x == revert || x == revert / 10;
    }
}
