package dev.idion.baekjoon.digitaltv;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import dev.idion.baekjoon.findprime.Main;
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
    String expected = "33";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));
    System.setIn(in);
    Main.main(null);
    assertThat(out.toString()).isEqualTo(expected);
  }
}
