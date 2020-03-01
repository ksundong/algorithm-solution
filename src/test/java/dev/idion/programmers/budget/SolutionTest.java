package dev.idion.programmers.budget;

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
        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;
        int expected = 3;
        int actual = solution.solution(d, budget);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        int[] d = {2, 2, 3, 3};
        int budget = 10;
        int expected = 4;
        int actual = solution.solution(d, budget);
        assertThat(actual).isEqualTo(expected);
    }
}
