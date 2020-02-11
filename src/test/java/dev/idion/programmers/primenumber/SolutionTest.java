package dev.idion.programmers.primenumber;

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
        int n = 10;
        int expected = 4;
        int actual = solution.solution(n);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        int n = 5;
        int expected = 3;
        int actual = solution.solution(n);
        assertThat(actual).isEqualTo(expected);
    }
}
