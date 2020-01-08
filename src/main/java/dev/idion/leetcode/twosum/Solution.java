package dev.idion.leetcode.twosum;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = {};
        int numsArrayLength = nums.length;

        for (int i = 0; i < numsArrayLength; i++) {
            int numOne = nums[i];
            for (int j = i + 1; j < numsArrayLength; j++) {
                if (target - numOne == nums[j]) {
                    return i < j ? new int[] {i, j} : new int[] {j, i};
                }
            }
        }
        return answer;
    }
}
