package dev.idion.baekjoon.adivideb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        System.out.printf("%.9f%n", (Double.parseDouble(strArr[0]) / Double.parseDouble(strArr[1])));
    }
}
