package dev.idion.leetcode.challenge.majorityelement;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int num : nums) {
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }

        int count = Integer.MIN_VALUE;
        int retval = 0;
        for (int key : numMap.keySet()) {
            if (count < numMap.get(key)) {
                count = Math.max(count, numMap.get(key));
                retval = key;
            }
        }
        return retval;
    }
}
