package dev.idion.programmers.phonenumberlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void solution1() {
        String[] input = {"119", "97674223", "1195524421"};
        boolean expected = false;
        boolean actual = solution.solution(input);
        assertEquals(expected, actual);
    }

    @Test
    void solution2() {
        String[] input = {"123", "456", "789"};
        boolean expected = true;
        boolean actual = solution.solution(input);
        assertEquals(expected, actual);
    }

    @Test
    void solution3() {
        String[] input = {"12", "123", "1235", "567", "88"};
        boolean expected = false;
        boolean actual = solution.solution(input);
        assertEquals(expected, actual);
    }

    @Test
    void solution4() {
        String[] input = {"1443", "12335", "1235", "567", "88"};
        boolean expected = true;
        boolean actual = solution.solution(input);
        assertEquals(expected, actual);
    }
}