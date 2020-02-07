package dev.idion.programmers.stringdescendingorder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testSolution1() {
        String s = "Zbcdefg";
        String expected = "gfedcbZ";
        String actual = solution.solution(s);
        assertEquals(expected, actual);
    }
}