package dev.idion.programmers.sumofprocession;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testSolution1() {
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        int[][] expected = {{4, 6}, {7, 9}};
        int[][] actual = solution.solution(arr1, arr2);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        int[][] arr1 = {{1}, {2}};
        int[][] arr2 = {{3}, {4}};
        int[][] expected = {{4}, {6}};
        int[][] actual = solution.solution(arr1, arr2);
        assertThat(actual).isEqualTo(expected);
    }
}
