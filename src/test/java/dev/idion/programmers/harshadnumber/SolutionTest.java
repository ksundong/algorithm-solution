package dev.idion.programmers.harshadnumber;

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
        int x = 10;
        boolean expected = true;
        boolean actual = solution.solution(x);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        int x = 12;
        boolean expected = true;
        boolean actual = solution.solution(x);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution3() {
        int x = 11;
        boolean expected = false;
        boolean actual = solution.solution(x);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution4() {
        int x = 13;
        boolean expected = false;
        boolean actual = solution.solution(x);
        assertThat(actual).isEqualTo(expected);
    }
}
