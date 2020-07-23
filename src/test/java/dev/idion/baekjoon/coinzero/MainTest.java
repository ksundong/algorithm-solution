package dev.idion.baekjoon.coinzero;

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
    String input = "10 4200\n1\n5\n10\n50\n100\n500\n1000\n5000\n10000\n50000";
    String expected = "6";
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
    String input = "10 4790\n1\n5\n10\n50\n100\n500\n1000\n5000\n10000\n50000";
    String expected = "12";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));
    System.setIn(in);
    Main.main(null);
    assertThat(out.toString()).isEqualTo(expected);
  }
}
