package dev.idion.programmers.year2016;

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
        int month = 5;
        int date = 24;
        String expected = "TUE";
        String actual = solution.solution(month, date);
        assertEquals(expected, actual, "원하는 요일명과 일치하지 않습니다.");
    }

    @Test
    void testSolution2() {
        int month = 1;
        int date = 1;
        String expected = "FRI";
        String actual = solution.solution(month, date);
        assertEquals(expected, actual, "원하는 요일명과 일치하지 않습니다.");
    }
}