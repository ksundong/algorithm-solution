package dev.idion.programmers.maskingphonenumber;

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
        String phoneNumber = "01033334444";
        String expected = "*******4444";
        String actual = solution.solution(phoneNumber);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        String phoneNumber = "027778888";
        String expected = "*****8888";
        String actual = solution.solution(phoneNumber);
        assertThat(actual).isEqualTo(expected);
    }
}
