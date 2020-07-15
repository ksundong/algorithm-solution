package dev.idion.programmers.ironbar;

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
  @DisplayName("solution test 1")
  void solutionTest1() {
    String arragement = "()(((()())(())()))(())";
    int expected = 17;

    assertThat(solution.solution(arragement)).isEqualTo(expected);
  }

  @Test
  @DisplayName("solution test 2")
  void solutionTest2() {
    String arragement = "()";
    int expected = 0;

    assertThat(solution.solution(arragement)).isEqualTo(expected);
  }
}
