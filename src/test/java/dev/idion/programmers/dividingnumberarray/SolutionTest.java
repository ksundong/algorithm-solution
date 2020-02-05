package dev.idion.programmers.dividingnumberarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testSolution1() {
        int[] inputArray = {5, 7, 9, 10};
        int inputdivisor = 5;
        int[] expected = {5, 10};
        int[] actual = solution.solution(inputArray, inputdivisor);
        assertArrayEquals(expected, actual, "원하는 배열이 출력되지 않았습니다.");
    }

    @Test
    void testSolution2() {
        int[] inputArray = {2, 36, 1, 3};
        int inputdivisor = 1;
        int[] expected = {1, 2, 3, 36};
        int[] actual = solution.solution(inputArray, inputdivisor);
        assertArrayEquals(expected, actual, "원하는 배열이 출력되지 않았습니다.");
    }

    @Test
    void testSolution3() {
        int[] inputArray = {3, 2, 6};
        int inputdivisor = 10;
        int[] expected = {-1};
        int[] actual = solution.solution(inputArray, inputdivisor);
        assertArrayEquals(expected, actual, "원하는 배열이 출력되지 않았습니다.");
    }
}