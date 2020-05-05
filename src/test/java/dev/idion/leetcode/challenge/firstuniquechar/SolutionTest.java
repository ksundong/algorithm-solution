package dev.idion.leetcode.challenge.firstuniquechar;

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
    void firstUniqChar() {
        String s = "leetcode";
        int expected = 0;
        int actual = solution.firstUniqChar(s);
        assertThat(actual).isEqualTo(expected);
    }
}
