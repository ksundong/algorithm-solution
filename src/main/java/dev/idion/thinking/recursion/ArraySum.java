package dev.idion.thinking.recursion;

public class ArraySum {
    public int sum(int[] arr) {
        return sum(arr, 0, 0);
    }

    private int sum(int[] arr, int position, int sum) {
        if (arr.length == position) {
            return sum;
        }
        return sum(arr, position + 1, sum + arr[position]);
    }
}
