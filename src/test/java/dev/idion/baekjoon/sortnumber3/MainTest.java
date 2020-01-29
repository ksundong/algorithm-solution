package dev.idion.baekjoon.sortnumber3;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void main() throws IOException {
        String input = "10\n5\n2\n3\n1\n4\n2\n3\n5\n1\n7";
        String expected = "1\n1\n2\n2\n3\n3\n4\n5\n5\n7\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Main.main(null);
        assertEquals(expected, out.toString());
    }

}