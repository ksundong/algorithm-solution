package dev.idion.programmers.makerectangle;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(makeRectangle(a, b));
    }

    private static String makeRectangle(int a, int b) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
