package dev.idion.programmers.watermelon;

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
        String expected = "수박수";
        String actual = solution.solution(n);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        int n = 4;
        String expected = "수박수박";
        String actual = solution.solution(n);
        assertThat(actual).isEqualTo(expected);
    }
}
