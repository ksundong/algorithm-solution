package dev.idion.programmers.getmiddlecharacter;

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
        String input = "abcde";
        String expected = "c";
        String actual = solution.solution(input);
        assertEquals(expected, actual, "대상 글자는 가운데 글자가 아닙니다.");
    }

    @Test
    void testSolution2() {
        String input = "qwer";
        String expected = "we";
        String actual = solution.solution(input);
        assertEquals(expected, actual, "대상 글자는 가운데 글자가 아닙니다.");
    }
}