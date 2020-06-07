package dev.idion.programmers.truckpassingbridge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    @DisplayName("test1")
    void test1() {
        int bridgeLength = 2;
        int weight = 10;
        int[] truckWeights = {7, 4, 5, 6};
        int expected = 8;

        int actual = solution.solution(bridgeLength, weight, truckWeights);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("test2")
    void test2() {
        int bridgeLength = 100;
        int weight = 100;
        int[] truckWeights = {10};
        int expected = 101;

        int actual = solution.solution(bridgeLength, weight, truckWeights);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("test3")
    void test3() {
        int bridgeLength = 100;
        int weight = 100;
        int[] truckWeights = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int expected = 110;

        int actual = solution.solution(bridgeLength, weight, truckWeights);

        assertThat(actual).isEqualTo(expected);
    }
}
