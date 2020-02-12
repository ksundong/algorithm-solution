package dev.idion.programmers.parseint;

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
        String s = "1234";
        int expected = 1234;
        int actual = solution.solution(s);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        String s = "-1234";
        int expected = -1234;
        int actual = solution.solution(s);
        assertThat(actual).isEqualTo(expected);
    }
}
