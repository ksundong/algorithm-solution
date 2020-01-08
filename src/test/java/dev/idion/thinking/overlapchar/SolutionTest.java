package dev.idion.thinking.overlapchar;

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
    void checkOverlapChar() {
        boolean expected = false;
        boolean actual = solution.checkOverlapChar("abc");
        assertEquals(expected, actual);

        expected = true;
        actual = solution.checkOverlapChar("abca");
        assertEquals(expected, actual);

        expected = false;
        actual = solution.checkOverlapChar("");
        assertEquals(expected, actual);
    }
}