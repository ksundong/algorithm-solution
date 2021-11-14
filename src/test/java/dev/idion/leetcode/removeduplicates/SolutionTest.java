package dev.idion.leetcode.removeduplicates;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testRemoveDuplicates1() {
        int[] nums = {1, 1, 2};
        int expectedReturnValue = 2;
        int actualReturnValue = solution.removeDuplicates(nums);
        assertEquals(expectedReturnValue, actualReturnValue);
    }

    @Test
    void testRemoveDuplicates2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expectedReturnValue = 5;
        int actualReturnValue = solution.removeDuplicates(nums);
        assertEquals(expectedReturnValue, actualReturnValue);
    }

    @Test
    void testRemoveDuplicates3() {
        int[] nums = {0, 0, 2, 2, 2, 4, 6, 20, 20, 20};
        int expectedReturnValue = 5;
        int actualReturnValue = solution.removeDuplicates(nums);
        assertEquals(expectedReturnValue, actualReturnValue);
    }

    @Test
    void testRemoveDuplicates4() {
        int[] nums = {};
        int expectedReturnValue = 0;
        int actualReturnValue = solution.removeDuplicates(nums);
        assertEquals(expectedReturnValue, actualReturnValue);
    }
}
