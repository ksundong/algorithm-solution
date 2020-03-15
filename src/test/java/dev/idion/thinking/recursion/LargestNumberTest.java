package dev.idion.thinking.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LargestNumberTest {
    LargestNumber largestNumber;

    @BeforeEach
    void setUp() {
        largestNumber = new LargestNumber();
    }

    @Test
    void testGet1() {
        List<Integer> list = Arrays.asList(1, 2, 3, 7, 5);
        int expected = 7;
        int actual = largestNumber.get(list);
        assertThat(actual).isEqualTo(expected);
    }
}
