package dev.idion.programmers.gymsuit;

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
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        int expected = 5;
        int actual = solution.solution(n, lost, reserve);
        assertEquals(expected, actual, "예상 출력과 다릅니다.");
    }

    @Test
    void testSolution2() {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {3};
        int expected = 4;
        int actual = solution.solution(n, lost, reserve);
        assertEquals(expected, actual, "예상 출력과 다릅니다.");
    }

    @Test
    void testSolution3() {
        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};
        int expected = 2;
        int actual = solution.solution(n, lost, reserve);
        assertEquals(expected, actual, "예상 출력과 다릅니다.");
    }

    @Test
    void testSolution4() {
        int n = 5;
        int[] lost = {4, 5};
        int[] reserve = {4};
        int expected = 4;
        int actual = solution.solution(n, lost, reserve);
        assertEquals(expected, actual, "예상 출력과 다릅니다.");
    }
}