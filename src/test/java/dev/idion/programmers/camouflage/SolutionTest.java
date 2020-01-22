package dev.idion.programmers.camouflage;

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
        String[][] input = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };
        int expected = 5;
        int actual = solution.solution(input);
        assertEquals(expected, actual);
    }

    @Test
    void solution2() {
        String[][] input = {
                {"crow_mask", "face"},
                {"blue_sunglasses", "face"},
                {"smoky_makeup", "face"}
        };
        int expected = 3;
        int actual = solution.solution(input);
        assertEquals(expected, actual);
    }

    @Test
    void solution3() {
        String[][] input = {
                {"aaa", "face"},
                {"bbb", "top"},
                {"ccc", "top"},
                {"ddd", "pants"},
                {"eee", "face"}
        };
        int expected = 17;
        int actual = solution.solution(input);
        assertEquals(expected, actual);
    }
}