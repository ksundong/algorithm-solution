package dev.idion.thinking.sorting;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FEQuickSort {
    public static void main(String[] args) {
        FEQuickSort feQuickSort = new FEQuickSort();
        int[] arr = {3, 5, 4, 4, 7, 4, 8, 1, 2, 6};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sort(int[] arr) {
        if (arr.length < 1) {
            return arr;
        }
        int pivot = arr[0];
        arr = IntStream.concat(Arrays.stream(sort(Arrays.stream(arr).filter(x -> x < pivot).toArray())),
                IntStream.concat(IntStream.of(pivot),
                        Arrays.stream(sort(Arrays.stream(arr).filter(x -> x > pivot).toArray())))).toArray();
        return arr;
    }
}
