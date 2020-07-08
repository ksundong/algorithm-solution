package dev.idion.programmers.tower;

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
  @DisplayName("solution Test1")
  void solutionTest1() {
    int[] heights = {6, 9, 5, 7, 4};
    int[] expected = {0, 0, 2, 2, 4};

    assertThat(solution.solution(heights)).isEqualTo(expected);
  }

  @Test
  @DisplayName("solution Test2")
  void solutionTest2() {
    int[] heights = {3, 9, 9, 3, 5, 7, 2};
    int[] expected = {0, 0, 0, 3, 3, 3, 6};

    assertThat(solution.solution(heights)).isEqualTo(expected);
  }

  @Test
  @DisplayName("solution Test3")
  void solutionTest3() {
    int[] heights = {1, 5, 3, 6, 7, 6, 5};
    int[] expected = {0, 0, 2, 0, 0, 5, 6};

    assertThat(solution.solution(heights)).isEqualTo(expected);
  }
}
