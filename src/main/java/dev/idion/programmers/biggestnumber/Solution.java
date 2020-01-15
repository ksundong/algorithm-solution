package dev.idion.programmers.biggestnumber;

import java.util.Arrays;

public class Solution {
    public String solution(int[] numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = numbers.length;
        String[] stringNumbers = new String[length];

        for (int i = 0; i < length; i++) {
            stringNumbers[i] = Integer.toString(numbers[i]);
        }
        Arrays.sort(stringNumbers, (current, compare) -> {
            StringBuilder currentStringBuilder = new StringBuilder();
            StringBuilder compareStringBuilder = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                currentStringBuilder.append(current);
                compareStringBuilder.append(compare);
            }
            int currentNumber = Integer.parseInt(currentStringBuilder.toString().substring(0, 4));
            int compareNumber = Integer.parseInt(compareStringBuilder.toString().substring(0, 4));
            return Integer.compare(compareNumber, currentNumber);
        });

        for (int i = 0; i < length; i++) {
            stringBuilder.append(stringNumbers[i]);
        }
        String answer = stringBuilder.toString();
        if (answer.charAt(0) == '0') answer = "0";

        return answer;
    }
}
