package dev.idion.thinking.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {
    Factorial factorial;

    @BeforeEach
    void setUp() {
        factorial = new Factorial();
    }

    @Test
    void testGet1() {
        long number = 3;
        long expected = 6;
        long actual = factorial.get(number);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testGet2() {
        long number = 20;
        long expected = 2432902008176640000L;
        long actual = factorial.get(number);
        assertThat(actual).isEqualTo(expected);
    }
}
