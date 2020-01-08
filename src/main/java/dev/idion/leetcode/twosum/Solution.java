package dev.idion.leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = {};
        Map<Integer, Integer> sumMap = new HashMap<>();
        int numsArrayLength = nums.length;

        for (int i = 0; i < numsArrayLength; i++) {
            sumMap.put(nums[i], i);
        }

        for (int i = 0; i < numsArrayLength; i++) {
            int wantedValue = target - nums[i];
            if (sumMap.containsKey(wantedValue) && sumMap.get(wantedValue) != i) {
                return new int[] {i, sumMap.get(wantedValue)};
            }
        }
        return answer;
    }
}
