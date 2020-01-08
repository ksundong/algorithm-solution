package dev.idion.leetcode.twosum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void twoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        int[] expected = {0, 2};
        int[] actual = solution.twoSum(nums, target);
        assertArrayEquals(expected, actual);

        nums = new int[]{2, 7, 11, 15};
        target = 9;
        expected = new int[]{0, 1};
        actual = solution.twoSum(nums, target);
        assertArrayEquals(expected, actual);

        nums = new int[]{3, 2, 4};
        target = 6;
        expected = new int[]{1, 2};
        actual = solution.twoSum(nums, target);
        assertArrayEquals(expected, actual);

        nums = new int[]{3, 2, 4};
        target = 8;
        expected = new int[]{};
        actual = solution.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }
}