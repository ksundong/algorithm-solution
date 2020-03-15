package dev.idion.thinking.recursion;

public class ArraySum {
    public int sum(int[] arr) {
        return sum(arr, 0);
    }

    private int sum(int[] arr, int position) {
        if (arr.length == position) {
            return 0;
        }
        int integer = arr[position];
        return integer + sum(arr, position + 1);
    }
}
