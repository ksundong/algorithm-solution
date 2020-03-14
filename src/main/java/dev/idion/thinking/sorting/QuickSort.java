package dev.idion.thinking.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr = {3, 5, 4, 4, 7, 4, 8, 1, 2, 6};
        quickSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private int partition(int[] arr, int firstIndex, int lastIndex) {
        int pivot = arr[firstIndex];
        int k = lastIndex;

        for (int j = lastIndex; j > firstIndex; j--) {
            if (arr[j] > pivot) {
                // swap
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                k--;
            }
        }

        int temp = arr[firstIndex];
        arr[firstIndex] = arr[k];
        arr[k] = temp;

        return k;
    }

    public void sort(int[] arr, int firstIndex, int lastIndex) {
        if (firstIndex < lastIndex) {
            int pi = partition(arr, firstIndex, lastIndex);

            sort(arr, firstIndex, pi - 1);
            sort(arr, pi + 1, lastIndex);
        }
    }

    public void sort(int[] arr) {
        this.sort(arr, 0, arr.length - 1);
    }
}
