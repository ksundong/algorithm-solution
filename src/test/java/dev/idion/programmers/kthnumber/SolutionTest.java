package dev.idion.programmers.kthnumber;

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
    void testSolution1() {
        int[] inputArray = {1, 5, 2, 6, 3, 7, 4};
        int[] command1 = {2, 5, 3};
        int[] command2 = {4, 4, 1};
        int[] command3 = {1, 7, 3};
        int[][] commandArray = {command1, command2, command3};
        int[] expected = {5, 6, 3};
        int[] actual = solution.solution(inputArray, commandArray);
        assertEquals(commandArray.length, actual.length); // 입력 길이와 출력길이가 같은지 확인
        assertArrayEquals(expected, actual);
    }

    @Test
    void testSolution2() {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] command1 = {1, 5, 3};
        int[] command2 = {4, 7, 1};
        int[] command3 = {2, 6, 3};
        int[] command4 = {5, 8, 2};
        int[][] commandArray = {command1, command2, command3, command4};
        int[] expected = {3, 4, 4, 6};
        int[] actual = solution.solution(inputArray, commandArray);
        assertEquals(commandArray.length, actual.length); // 입력 길이와 출력길이가 같은지 확인
        assertArrayEquals(expected, actual);
    }

    @Test
    void testSolution3() {
        int[] inputArray = {6, 2, 4, 0, 1, 3, 6, 2, 8};
        int[] command1 = {3, 7, 2};
        int[] command2 = {6, 7, 2};
        int[][] commandArray = {command1, command2};
        int[] expected = {1, 6};
        int[] actual = solution.solution(inputArray, commandArray);
        assertEquals(commandArray.length, actual.length); // 입력 길이와 출력길이가 같은지 확인
        assertArrayEquals(expected, actual);
    }
}