package dev.idion.leetcode.reverseinteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverse() {
        Solution solution = new Solution();

        int expected = 321;
        int actual = solution.reverse(123);
        assertEquals(expected, actual);

        expected = -321;
        actual = solution.reverse(-123);
        assertEquals(expected, actual);

        expected = 21;
        actual = solution.reverse(120);
        assertEquals(expected, actual);

        expected = 0;
        actual = solution.reverse(1534236469);
        assertEquals(expected, actual);

        expected = 0;
        actual = solution.reverse(-1534236469);
        assertEquals(expected, actual);
    }
}