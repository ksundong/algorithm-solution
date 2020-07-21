package dev.idion.programmers.joystick;

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
    String name ="JEROEN";
    int expected = 56;

    assertThat(solution.solution(name)).isEqualTo(expected);
  }

  @Test
  @DisplayName("Solution Test 2")
  void solutionTest2() {
    String name ="JAN";
    int expected = 23;

    assertThat(solution.solution(name)).isEqualTo(expected);
  }
}
