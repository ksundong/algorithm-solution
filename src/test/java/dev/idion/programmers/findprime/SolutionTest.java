package dev.idion.programmers.findprime;

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
  @DisplayName("Solution Test 1")
  void solutionTest1() {
    String numbers = "17";
    int expected = 3;

    assertThat(solution.solution(numbers)).isEqualTo(expected);
  }

  @Test
  @DisplayName("Solution Test 2")
  void solutionTest2() {
    String numbers = "011";
    int expected = 2;

    assertThat(solution.solution(numbers)).isEqualTo(expected);
  }
}
