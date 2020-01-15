package dev.idion.leetcode.removeduplicates;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int currentNumber = Integer.MIN_VALUE;
        int nextIndex = 0;

        for (int i = 0, numsLength = nums.length; i < numsLength; i++) {
            int newNumber = nums[i];
            if (currentNumber < newNumber) {
                currentNumber = newNumber;
                nums[nextIndex] = currentNumber;
                nextIndex++;
            }
        }

        return nextIndex;
    }
}
