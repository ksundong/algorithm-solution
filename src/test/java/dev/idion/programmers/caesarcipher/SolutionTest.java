package dev.idion.programmers.caesarcipher;

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
    void testCase1() {
        String s = "AB";
        int n = 1;
        String expected = "BC";
        String actual = solution.solution(s, n);
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    void testCase2() {
        String s = "z";
        int n = 1;
        String expected = "a";
        String actual = solution.solution(s, n);
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    void testCase3() {
        String s = "a B z";
        int n = 4;
        String expected = "e F d";
        String actual = solution.solution(s, n);
        assertThat(expected).isEqualTo(actual);
    }
}
