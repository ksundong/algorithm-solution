package dev.idion.kakaointernship;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ThirdTest {

    @Test
    void solution() {
        Third third = new Third();
        String[] gems = {"AA", "AB", "AC", "AA", "AC"};
        int[] expected = {1, 3};
        int[] actual = third.solution(gems);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void solution2() {
        Third third = new Third();
        String[] gems = {"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
        int[] expected = {3, 7};
        int[] actual = third.solution(gems);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void solution3() {
        Third third = new Third();
        String[] gems = {"XYZ", "XYZ", "XYZ"};
        int[] expected = {1, 1};
        int[] actual = third.solution(gems);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void solution4() {
        Third third = new Third();
        String[] gems = {"ZZZ", "YYY", "NNNN", "YYY", "BBB"};
        int[] expected = {1, 5};
        int[] actual = third.solution(gems);
        assertThat(actual).isEqualTo(expected);
    }
}
