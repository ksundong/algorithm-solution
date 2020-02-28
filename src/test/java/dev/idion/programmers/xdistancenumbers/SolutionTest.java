package dev.idion.programmers.xdistancenumbers;

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
        int x = 2;
        int n = 5;
        long[] expected = {2L, 4L, 6L, 8L, 10L};
        long[] actual = solution.solution(x, n);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        int x = 4;
        int n = 3;
        long[] expected = {4L, 8L, 12L};
        long[] actual = solution.solution(x, n);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution3() {
        int x = -4;
        int n = 2;
        long[] expected = {-4L, -8L};
        long[] actual = solution.solution(x, n);
        assertThat(actual).isEqualTo(expected);
    }
}
