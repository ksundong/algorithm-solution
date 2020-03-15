package dev.idion.thinking.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ListCountTest {
    ListCount listCount;

    @BeforeEach
    void setUp() {
        listCount = new ListCount();
    }

    @Test
    void testCount1() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int expected = 5;
        int actual = listCount.count(list);
        assertThat(actual).isEqualTo(expected);
    }
}
