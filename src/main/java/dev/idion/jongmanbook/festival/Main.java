package dev.idion.jongmanbook.festival;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int repeat = Integer.parseInt(sc.nextLine());
        double[] result = new double[repeat];

        for (int i = 0; i < repeat; i++) {
            int teams = Integer.parseInt(sc.nextLine().split(" ")[1]);
            String[] costs = sc.nextLine().split(" ");
            int days = costs.length;

            int[] arr = new int[days];
            for (int j = 0; j < days; j++) {
                arr[j] = Integer.parseInt(costs[j]);
            }

            // prefix sum
            int[] prefixSum = new int[days];
            prefixSum[0] = arr[0];
            for (int j = 1; j < days; j++) {
                prefixSum[j] = prefixSum[j - 1] + arr[j];
            }

            double avgCost = Double.MAX_VALUE;
            // n개의 팀부터 모든 날까지
            for (int j = teams; j < days; j++) {
                int minSum = prefixSum[j - 1];
                for (int k = 1; k < days - j; k++) {
                    minSum = Math.min(prefixSum[j + k - 1] - prefixSum[k - 1], minSum);
                }
                double tmpAvgCost = (double) minSum / (double) j;
                avgCost = Math.min(avgCost, tmpAvgCost);
            }
            result[i] = avgCost;
        }
        for (double v : result) {
            System.out.printf("%.11f%n", v);
        }

        sc.close();
    }
}
