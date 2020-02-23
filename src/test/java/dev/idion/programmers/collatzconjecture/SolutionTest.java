package dev.idion.programmers.collatzconjecture;

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
        int n = 6;
        int expected = 8;
        int actual = solution.solution(n);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        int n = 16;
        int expected = 4;
        int actual = solution.solution(n);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution3() {
        int n = 626331;
        int expected = -1;
        int actual = solution.solution(n);
        assertThat(actual).isEqualTo(expected);
    }
}
