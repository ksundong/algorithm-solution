package dev.idion.leetcode.singlenumber;

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
    void singleNumber1() {
        int[] input = {2, 2, 1};
        int expected = 1;
        int actual = solution.singleNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    void singleNumber2() {
        int[] input = {4, 1, 2, 1, 2};
        int expected = 4;
        int actual = solution.singleNumber(input);
        assertEquals(expected, actual);
    }
}