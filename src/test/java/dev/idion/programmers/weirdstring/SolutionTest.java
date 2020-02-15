package dev.idion.programmers.weirdstring;

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
    void testSolution() {
        String s = "try hello world";
        String expected = "TrY HeLlO WoRlD";
        String actual = solution.solution(s);
        assertThat(actual).isEqualTo(expected);
    }
}
