package dev.idion.programmers.coloringbook;

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
  @DisplayName("Solution test1")
  void solutionTest1() {
    int m = 6;
    int n = 4;
    int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
    int[] expected = {4, 5};

    assertThat(solution.solution(m, n, picture)).isEqualTo(expected);
  }
}
