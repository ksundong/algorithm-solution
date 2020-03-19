package dev.idion.thinking.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int firstIndex, int lastIndex) {
        if (firstIndex < lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;

            sort(arr, firstIndex, middleIndex);
            sort(arr, middleIndex + 1, lastIndex);

            merge(arr, firstIndex, middleIndex, lastIndex);
        }
    }

    private static void merge(int[] arr, int firstIndex, int middleIndex, int lastIndex) {
        if (arr[middleIndex] <= arr[middleIndex + 1]) {
            return;
        }

        int i = 0;
        int j = 0;
        int t = firstIndex;
        int[] leftArray = Arrays.copyOfRange(arr, firstIndex, middleIndex + 1);
        int[] rightArray = Arrays.copyOfRange(arr, middleIndex + 1, lastIndex + 1);

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                arr[t] = leftArray[i];
                i++;
            } else {
                arr[t] = rightArray[j];
                j++;
            }
            t++;
        }

        while (i < leftArray.length) {
            arr[t] = leftArray[i];
            i++;
            t++;
        }

        while (j < rightArray.length) {
            arr[t] = rightArray[j];
            j++;
            t++;
        }

    }
}
