package dev.idion.programmers.stringdescendingorder;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String s) {
        Character[] characters = s
                .chars()
                .mapToObj(c -> (char) c)
                .toArray(Character[]::new);
        Arrays.sort(characters, Collections.reverseOrder());
        return Arrays
                .stream(characters)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
