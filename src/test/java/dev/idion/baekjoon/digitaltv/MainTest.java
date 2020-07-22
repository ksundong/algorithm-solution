package dev.idion.baekjoon.digitaltv;

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
    String input = "3\nMBC\nKBS1\nKBS2";
    String expected = "14114";
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
    String input = "5\nMBC\nSBS\nJTBC\nKBS1\nKBS2";
    String expected = "1114441111444";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));
    System.setIn(in);
    Main.main(null);
    assertThat(out.toString()).isEqualTo(expected);
  }

  @Test
  @DisplayName("solution test3")
  void solutionTest3() throws IOException {
    String input = "5\nMBC\nSBS\nJTBC\nKBS2\nKBS1";
    String expected = "111144441111444";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));
    System.setIn(in);
    Main.main(null);
    assertThat(out.toString()).isEqualTo(expected);
  }
}
