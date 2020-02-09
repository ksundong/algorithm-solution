package dev.idion.programmers.kimseobang;

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
        String[] seoul = {"Jane", "Kim"};
        String expected = "김서방은 1에 있다.";
        String actual = solution.solution(seoul);
        assertEquals(expected, actual);
    }
}