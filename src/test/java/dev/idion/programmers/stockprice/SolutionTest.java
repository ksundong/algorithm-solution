package dev.idion.programmers.stockprice;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution;

  @BeforeEach
  void setUp() {
    solution = new Solution();
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] prices = {1, 2, 3, 2, 3};
    int[] expected = {4, 3, 1, 1, 0};

    assertThat(solution.solution(prices)).isEqualTo(expected);
  }
}
