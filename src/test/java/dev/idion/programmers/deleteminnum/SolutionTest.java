package dev.idion.programmers.deleteminnum;

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
        int[] arr = {4, 3, 2, 1};
        int[] expected = {4, 3, 2};
        int[] actual = solution.solution(arr);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        int[] arr = {10};
        int[] expected = {-1};
        int[] actual = solution.solution(arr);
        assertThat(actual).isEqualTo(expected);
    }
}
