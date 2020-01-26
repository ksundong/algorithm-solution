package dev.idion.thinking.sorting;

public class BubbleSort {
    public void sort(int[] arr) {
        for (int i = 0, length = arr.length; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[i + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
