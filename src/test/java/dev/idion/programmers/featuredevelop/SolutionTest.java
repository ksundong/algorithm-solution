package dev.idion.programmers.featuredevelop;

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
  @DisplayName("Solution Test")
  void solutionTest() {
    int[] progresses = {93, 30, 55};
    int[] speeds = {1, 30, 5};
    int[] expected = {2, 1};
    assertThat(solution.solution(progresses, speeds)).isEqualTo(expected);
  }
}
