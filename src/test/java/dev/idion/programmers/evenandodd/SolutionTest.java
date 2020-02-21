package dev.idion.programmers.evenandodd;

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
        int num = 3;
        String expected = "Odd";
        String actual = solution.solution(num);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        int num = 4;
        String expected = "Even";
        String actual = solution.solution(num);
        assertThat(actual).isEqualTo(expected);
    }
}
