package dev.idion.programmers.integersquareroot;

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
        long n = 121L;
        long expected = 144;
        long actual = solution.solution(n);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        long n = 3L;
        long expected = -1;
        long actual = solution.solution(n);
        assertThat(actual).isEqualTo(expected);
    }

}
