package dev.idion.thinking.search;

public class BinarySearch {
    public int searchRecursive(int[] arr, int target, int firstIndex, int lastIndex) {
        if (firstIndex >= lastIndex) {
            return -1;
        }

        int middleIndex = (firstIndex + lastIndex) / 2;
        int middleValue = arr[middleIndex];

        if (target == middleValue) {
            return middleIndex;
        } else if (target < middleValue) {
            return searchRecursive(arr, target, firstIndex, middleIndex - 1);
        } else {
            return searchRecursive(arr, target, middleIndex + 1, lastIndex);
        }
    }

    public int search(int[] arr, int target) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while (firstIndex < lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            int middleValue = arr[middleIndex];

            if (target == middleValue) {
                return middleIndex;
            } else if (target < middleValue) {
                lastIndex = middleIndex - 1;
            } else {
                firstIndex = middleIndex + 1;
            }
        }

        return -1;
    }
}
