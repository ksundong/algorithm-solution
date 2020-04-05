package dev.idion.leetcode.palindromenumber;

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
    void testIsPalindrome1() {
        int x = 121;
        boolean expected = true;
        boolean actual = solution.isPalindrome(x);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testIsPalindrome2() {
        int x = -121;
        boolean expected = false;
        boolean actual = solution.isPalindrome(x);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testIsPalindrome3() {
        int x = 10;
        boolean expected = false;
        boolean actual = solution.isPalindrome(x);
        assertThat(actual).isEqualTo(expected);
    }
}
