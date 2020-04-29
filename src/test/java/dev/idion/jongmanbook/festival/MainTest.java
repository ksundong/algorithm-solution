package dev.idion.jongmanbook.festival;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    void main() {
        String input = "2\n6 3\n1 2 3 1 2 3\n6 2\n1 2 3 1 2 3";
        String expected = "1.75000000000\n1.50000000000";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Main.main(null);
        assertThat(out.toString()).isEqualTo(expected);
    }
}
