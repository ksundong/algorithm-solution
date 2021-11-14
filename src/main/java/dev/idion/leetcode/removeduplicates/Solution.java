package dev.idion.leetcode.removeduplicates;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = Integer.MIN_VALUE;
        int current;
        int index = 0;

        for (int i = 0, numsLength = nums.length; i < numsLength; i++) {
            current = nums[i];
            if (prev < current) {
                prev = current;
                nums[index] = current;
                index++;
            }
        }

        return index;
    }
}
