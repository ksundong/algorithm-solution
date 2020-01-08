package dev.idion.programmers.incompleteplayer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void solution() {
        Solution solution = new Solution();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String expected = "leo";
        String actual = solution.solution(participant, completion);

        assertEquals(expected, actual);

        participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        completion = new String[]{"josipa", "filipa", "marina", "nikola"};
        expected = "vinko";
        actual = solution.solution(participant, completion);

        assertEquals(expected, actual);

        participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        completion = new String[]{"stanko", "ana", "mislav"};
        expected = "mislav";
        actual = solution.solution(participant, completion);

        assertEquals(expected, actual);

        participant = new String[]{"aaaa", "bbbb", "bbbb", "cccc"};
        completion = new String[]{"aaaa", "bbbb", "bbbb"};
        expected = "cccc";
        actual = solution.solution(participant, completion);

        assertEquals(expected, actual);
    }
}