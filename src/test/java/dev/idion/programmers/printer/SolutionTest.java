package dev.idion.programmers.printer;

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
  @DisplayName("예제 테스트1")
  void test1() {
    int[] priorities = {2, 1, 3, 2};
    int location = 2;
    int expected = 1;
    assertThat(solution.solution(priorities, location)).isEqualTo(expected);
  }

  @Test
  @DisplayName("예제 테스트2")
  void test2() {
    int[] priorities = {1, 1, 9, 1, 1, 1};
    int location = 0;
    int expected = 5;
    assertThat(solution.solution(priorities, location)).isEqualTo(expected);
  }
}
