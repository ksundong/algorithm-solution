package dev.idion.programmers.sumofmeasure;

public class Solution {
    public int solution(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) { // n / 2로 하면 더 빠르게 할 수 있다고 한다.
            sum += n % i == 0 ? i : 0;
        }
        return sum;
    }
}
