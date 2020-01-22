package dev.idion.leetcode.singlenumber;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        Map<Integer, Integer> duplicateMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            duplicateMap.put(num, duplicateMap.getOrDefault(num, 0) + 1);
        }
        for (int key : duplicateMap.keySet()) {
            if (duplicateMap.get(key) == 1) result = key;
        }
        return result;
    }
}
