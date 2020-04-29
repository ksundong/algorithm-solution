package dev.idion.jongmanbook.festival;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int repeat = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < repeat; i++) {
            int teams = Integer.parseInt(sc.nextLine().split(" ")[1]);
            String[] costs = sc.nextLine().split(" ");

            double avgCost = 100;

            // n개의 팀부터 모든 날까지
            for (int j = teams; j < costs.length; j++) {
                // 부분합 구하기
                int minSum = 100 * j;
                for (int k = 0; k < costs.length - j; k++) {
                    int sum = 0;
                    for (int l = 0; l < j; l++) {
                        sum += Integer.parseInt(costs[l]);
                    }
                    minSum = Math.min(sum, minSum);
                }
                double tmpAvgCost = (double) minSum / j;
                avgCost = Math.min(avgCost, tmpAvgCost);
            }
            System.out.printf("%.11f%n", avgCost);
        }

        sc.close();
    }
}
