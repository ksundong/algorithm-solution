package dev.idion.programmers.secretmap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testSolution1() {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] expected = {"#####", "# # #", "### #", "# ##", "#####"};
        String[] actual = solution.solution(n, arr1, arr2);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSolution2() {
        int n = 6;
        int[] arr1 = {46, 33, 33, 22, 31, 50};
        int[] arr2 = {27, 56, 19, 14, 14, 10};
        String[] expected = {"######", "### #", "## ##", " #### ", " #####", "### # "};
        String[] actual = solution.solution(n, arr1, arr2);
        assertThat(actual).isEqualTo(expected);
    }
}
