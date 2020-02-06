package dev.idion.programmers.twointegersum;

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
        int a = 3;
        int b = 5;
        long expected = 12;
        long actual = solution.solution(a, b);
        assertEquals(expected, actual, String.format("결과값 %d가 예상과 다릅니다.", actual));
    }

    @Test
    void testSolution2() {
        int a = 3;
        int b = 3;
        long expected = 3;
        long actual = solution.solution(a, b);
        assertEquals(expected, actual, String.format("결과값 %d가 예상과 다릅니다.", actual));
    }

    @Test
    void testSolution3() {
        int a = 5;
        int b = 3;
        long expected = 12;
        long actual = solution.solution(a, b);
        assertEquals(expected, actual, String.format("결과값 %d가 예상과 다릅니다.", actual));
    }
}