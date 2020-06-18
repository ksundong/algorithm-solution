package dev.idion.baekjoon.fourarithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] numStrs = br.readLine().split(" ");
        int[] nums = {Integer.parseInt(numStrs[0]), Integer.parseInt(numStrs[1])};

        StringBuilder sb = new StringBuilder();
        sb.append((nums[0] + nums[1]) + "\n");
        sb.append((nums[0] - nums[1]) + "\n");
        sb.append((nums[0] * nums[1]) + "\n");
        sb.append((nums[0] / nums[1]) + "\n");
        sb.append((nums[0] % nums[1]));

        System.out.print(sb.toString());
    }
}
