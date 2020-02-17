package dev.idion.programmers.naturalnumberarray;

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
        long n = 12345L;
        int[] expected = {5, 4, 3, 2, 1};
        int[] actual = solution.solution(n);
        assertThat(actual).isEqualTo(expected);
    }
}
