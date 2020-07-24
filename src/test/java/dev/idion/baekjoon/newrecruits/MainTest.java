package dev.idion.baekjoon.newrecruits;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  @DisplayName("solution test1")
  void solutionTest1() throws IOException {
    String input = "2\n5\n3 2\n1 4\n4 1\n2 3\n5 5\n7\n3 6\n7 3\n4 2\n1 4\n5 7\n2 5\n6 1";
    String expected = "4\n3";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));
    System.setIn(in);
    Main.main(null);
    assertThat(out.toString()).isEqualTo(expected);
  }

  @Test
  @DisplayName("solution test2")
  void solutionTest2() throws IOException {
    String input = "1\n5\n1 1\n2 5\n3 4\n4 3\n5 2";
    String expected = "1";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));
    System.setIn(in);
    Main.main(null);
    assertThat(out.toString()).isEqualTo(expected);
  }
}
