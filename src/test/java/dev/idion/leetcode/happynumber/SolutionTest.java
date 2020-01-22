package dev.idion.leetcode.happynumber;

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
    void isHappy19() {
        boolean expected = true;
        boolean actual = solution.isHappy(19);
        assertEquals(expected, actual);
    }

    @Test
    void isHappy2() {
        Solution solution = new Solution();
        boolean expected = false;
        boolean actual = solution.isHappy(2);
        assertEquals(expected, actual);
    }

    @Test
    void isHappy202() {
        Solution solution = new Solution();
        boolean expected = false;
        boolean actual = solution.isHappy(202);
        assertEquals(expected, actual);
    }
}