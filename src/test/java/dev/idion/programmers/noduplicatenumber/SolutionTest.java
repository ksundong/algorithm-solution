package dev.idion.programmers.noduplicatenumber;

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
        int[] input = {1, 1, 3, 3, 0, 1, 1};
        int[] expected = {1, 3, 0, 1};
        int[] actual = solution.solution(input);
        assertArrayEquals(expected, actual, "에상한 배열과 일치하지 않습니다.");
    }

    @Test
    void testSolution2() {
        int[] input = {4, 4, 4, 3, 3};
        int[] expected = {4, 3};
        int[] actual = solution.solution(input);
        assertArrayEquals(expected, actual, "에상한 배열과 일치하지 않습니다.");
    }
}