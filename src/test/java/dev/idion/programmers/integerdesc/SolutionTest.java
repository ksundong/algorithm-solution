package dev.idion.programmers.integerdesc;

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
    void solution() {
        long n = 118372L;
        long expected = 873211L;
        long actual = solution.solution(n);
        assertThat(actual).isEqualTo(expected);
    }
}
