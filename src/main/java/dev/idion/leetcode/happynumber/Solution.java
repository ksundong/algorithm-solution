package dev.idion.leetcode.happynumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> duplicateSet = new HashSet<>();
        int sum;
        int rest;
        while (true) {
            sum = 0;
            while (n != 0) {
                rest = n % 10;
                n /= 10;
                sum += rest * rest;
            }
            if (sum == 1) return true;
            if (duplicateSet.contains(sum)) return false;
            duplicateSet.add(sum);
            n = sum;
        }
    }
}
