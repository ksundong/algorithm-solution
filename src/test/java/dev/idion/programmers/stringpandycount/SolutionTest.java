package dev.idion.programmers.stringpandycount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testSolution1() {
        String s = "pPoooyY";
        boolean expected = true;
        boolean actual = solution.solution(s);
        assertEquals(expected, actual);
    }

    @Test
    void testSolution2() {
        String s = "Pyy";
        boolean expected = false;
        boolean actual = solution.solution(s);
        assertEquals(expected, actual);
    }
}