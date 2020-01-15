package dev.idion.programmers.biggestnumber;

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
    void testSolution1() {
        int[] numbers = {6, 10, 2};
        String expected = "6210";
        String actual = solution.solution(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testSolution2() {
        int[] numbers = {3, 30, 34, 5, 9};
        String expected = "9534330";
        String actual = solution.solution(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testSolution3() {
        int[] numbers = {0, 0, 0};
        String expected = "0";
        String actual = solution.solution(numbers);
        assertEquals(expected, actual);
    }

    @Test
    void testSolution4() {
        int[] numbers = {121, 12, 1212};
        String expected = "121212121";
        String actual = solution.solution(numbers);
        assertEquals(expected, actual);
    }
}