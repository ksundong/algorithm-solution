package dev.idion.thinking.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2, 9, 7, 5, 3, 1, 6, 2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int firstIndex, int lastIndex) {
        if (firstIndex < lastIndex) {
            int midIndex = (firstIndex + lastIndex) / 2;

            sort(arr, firstIndex, midIndex);
            sort(arr, midIndex + 1, lastIndex);

            merge(arr, firstIndex, midIndex, lastIndex);
        }
    }

    private static void merge(int[] arr, int firstIndex, int midIndex, int lastIndex) {
        int i = firstIndex;
        int j = midIndex + 1;

        if (arr[midIndex] <= arr[j]) { // 정렬 되어있으면 바로 리턴
            return;
        }

        while (i <= midIndex && j <= lastIndex) {
            if (arr[i] <= arr[j]) {
                i++;
            } else {
                int value = arr[j];
                int index = j;

                while (index != i) { // 여기서 O(n^2) 이 됨.
                    arr[index] = arr[index - 1];
                    index--;
                }
                arr[i] = value;

                // Update all the pointers
                i++;
                midIndex++;
                j++;
            }
        }
    }
}
