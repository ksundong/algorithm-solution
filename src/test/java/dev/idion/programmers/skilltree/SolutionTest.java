package dev.idion.programmers.skilltree;

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
    String skill = "CBD";
    String[] skillTrees = {"BACDE", "CBADF", "AECB", "BDA"};
    int expected = 2;

    assertThat(solution.solution(skill, skillTrees)).isEqualTo(expected);
  }
}
