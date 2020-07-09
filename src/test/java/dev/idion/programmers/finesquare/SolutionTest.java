package dev.idion.programmers.finesquare;

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
    int w = 8;
    int h = 12;
    long expected = 80L;

    assertThat(solution.solution(w, h)).isEqualTo(expected);
  }
}
