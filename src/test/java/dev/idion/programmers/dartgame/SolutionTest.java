package dev.idion.programmers.dartgame;

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
        String dartResult = "1S2D*3T";
        int expected = 37;
        int actual = solution.solution(dartResult);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        String dartResult = "1D2S#10S";
        int expected = 9;
        int actual = solution.solution(dartResult);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution3() {
        String dartResult = "1D2S0T";
        int expected = 3;
        int actual = solution.solution(dartResult);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution4() {
        String dartResult = "1S*2T*3S";
        int expected = 23;
        int actual = solution.solution(dartResult);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution5() {
        String dartResult = "1D#2S*3S";
        int expected = 5;
        int actual = solution.solution(dartResult);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution6() {
        String dartResult = "1T2D3D#";
        int expected = -4;
        int actual = solution.solution(dartResult);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution7() {
        String dartResult = "1D2S3T*";
        int expected = 59;
        int actual = solution.solution(dartResult);
        assertThat(actual).isEqualTo(expected);
    }
}
