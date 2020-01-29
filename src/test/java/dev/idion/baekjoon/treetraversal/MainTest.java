package dev.idion.baekjoon.treetraversal;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void main() {
        String input = "7\n" + "A B C\n" + "B D .\n" + "C E F\n" + "E . .\n" + "F . G\n" + "D . .\n" + "G . .";
        String expected = "ABDCEFG\n" + "DBAECFG\n" + "DBEGFCA";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));
        Main.main(null);
        assertEquals(expected, out.toString());
    }
}