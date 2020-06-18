package dev.idion.baekjoon.fourarithmetic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] numStr = br.readLine().split(" ");
        int[] nums = {Integer.parseInt(numStr[0]), Integer.parseInt(numStr[1])};

        String sb = (nums[0] + nums[1]) + "\n" + (nums[0] - nums[1]) + "\n" + nums[0] * nums[1] + "\n" + nums[0] / nums[1] + "\n" + (nums[0] % nums[1]);
        System.out.print(sb);
    }
}
