package dev.idion.programmers.failurerate;

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
        int n = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] expected = {3, 4, 2, 1, 5};
        int[] actual = solution.solution(n, stages);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        int n = 4;
        int[] stages = {4, 4, 4, 4, 4};
        int[] expected = {4, 1, 2, 3};
        int[] actual = solution.solution(n, stages);
        assertThat(actual).isEqualTo(expected);
    }
}
