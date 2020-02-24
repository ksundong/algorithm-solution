package dev.idion.programmers.getaverage;

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
        int[] arr = {1, 2, 3, 4};
        double expected = 2.5;
        double actual = solution.solution(arr);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        int[] arr = {5, 5};
        double expected = 5;
        double actual = solution.solution(arr);
        assertThat(actual).isEqualTo(expected);
    }
}
