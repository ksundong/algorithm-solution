package dev.idion.programmers.kthnumber;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        final int zero = 0;
        final int one = 1;
        final int two = 2;
        int arrayStart;
        int arrayEnd;
        int orderNum;

        int commandsLength = commands.length;
        int[] answer = new int[commandsLength];

        for (int i = 0; i < commandsLength; i++) {
            arrayStart = commands[i][zero] - one;
            arrayEnd = commands[i][one];
            orderNum = commands[i][two] - one;

            int[] tmpArray = Arrays.copyOfRange(array, arrayStart, arrayEnd);
            Arrays.sort(tmpArray);

            int ansVal = tmpArray[orderNum];
            answer[i] = ansVal;
        }

        return answer;
    }
}
