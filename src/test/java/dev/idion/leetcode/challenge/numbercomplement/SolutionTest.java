package dev.idion.leetcode.challenge.numbercomplement;

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
    void findComplement() {
        int num = 5;
        int expected = 2;
        int actual = solution.findComplement(num);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void findComplement2() {
        int num = 0;
        int expected = 1;
        int actual = solution.findComplement(num);
        assertThat(actual).isEqualTo(expected);
    }
}
