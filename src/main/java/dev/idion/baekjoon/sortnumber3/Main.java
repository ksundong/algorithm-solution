package dev.idion.baekjoon.sortnumber3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int numberCount = Integer.parseInt(bufferedReader.readLine());
        int[] numbers = new int[10001];
        for (int i = 0; i < numberCount; i++) {
            int number = Integer.parseInt(bufferedReader.readLine());
            numbers[number]++;
        }

        for (int i = 0; i <= 10000; i++) {
            while (numbers[i] != 0) {
                stringBuilder.append(i).append("\n");
                numbers[i]--;
            }
        }

        System.out.print(stringBuilder.toString());
    }
}
