package dev.idion.baekjoon.sortnumber3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberCount = Integer.parseInt(bufferedReader.readLine());

        int[] numbers = new int[numberCount];
        for (int i = 0; i < numberCount; i++) {
            int number = Integer.parseInt(bufferedReader.readLine());
            numbers[i] = number;
        }

        Arrays.sort(numbers);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numberCount; i++) {
            stringBuilder.append(numbers[i]).append("\n");
        }

        System.out.println(stringBuilder.toString());
    }
}
