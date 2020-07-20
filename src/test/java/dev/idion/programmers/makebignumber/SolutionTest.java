package dev.idion.programmers.makebignumber;

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
    String number = "1924";
    int k = 2;
    String expected = "94";

    assertThat(solution.solution(number, k)).isEqualTo(expected);
  }

  @Test
  @DisplayName("Solution Test 2")
  void solutionTest2() {
    String number = "1231234";
    int k = 3;
    String expected = "3234";

    assertThat(solution.solution(number, k)).isEqualTo(expected);
  }

  @Test
  @DisplayName("Solution Test 3")
  void solutionTest3() {
    String number = "4177252841";
    int k = 4;
    String expected = "775841";

    assertThat(solution.solution(number, k)).isEqualTo(expected);
  }

  @Test
  @DisplayName("Solution Test 4")
  void solutionTest4() {
    String number = "991188";
    int k = 4;
    String expected = "99";

    assertThat(solution.solution(number, k)).isEqualTo(expected);
  }

  @Test
  @DisplayName("Solution Test 5")
  void solutionTest5() {
    String number = "9979";
    int k = 2;
    String expected = "99";

    assertThat(solution.solution(number, k)).isEqualTo(expected);
  }
}
