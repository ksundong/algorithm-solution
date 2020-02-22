package dev.idion.programmers.gcfandlcm;

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
        int n = 3;
        int m = 12;
        int[] expected = {3, 12};
        int[] actual = solution.solution(n, m);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        int n = 2;
        int m = 5;
        int[] expected = {1, 10};
        int[] actual = solution.solution(n, m);
        assertThat(actual).isEqualTo(expected);
    }
}
