package dev.idion.programmers.stringsortmyself;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testSolution1() {
        String[] strings = {"sun", "bed", "cat"};
        int n = 1;
        String[] expected = {"car", "bed", "sun"};
        String[] actual = solution.solution(strings, n);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testSolution2() {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        String[] expected = {"abcd", "abce", "cdx"};
        String[] actual = solution.solution(strings, n);
        assertArrayEquals(expected, actual);
    }
}