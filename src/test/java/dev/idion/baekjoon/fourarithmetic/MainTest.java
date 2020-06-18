package dev.idion.baekjoon.fourarithmetic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    @DisplayName("사칙연산 테스트")
    void 사칙연산_테스트() throws IOException {
        String input = "7 3";
        String expected = "10\n4\n21\n2\n1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Main.main(null);
        assertThat(out.toString()).isEqualTo(expected);
    }
}
