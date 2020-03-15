package dev.idion.thinking.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArraySumTest {
    ArraySum arraySum;

    @BeforeEach
    void setUp() {
        arraySum = new ArraySum();
    }

    @Test
    void testSum1() {
        int[] arr = {3, 6};
        int expected = 9;
        int actual = arraySum.sum(arr);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSum2() {
        int[] arr = {3, 6, 8, 4, 7};
        int expected = 28;
        int actual = arraySum.sum(arr);
        assertThat(actual).isEqualTo(expected);
    }
}
