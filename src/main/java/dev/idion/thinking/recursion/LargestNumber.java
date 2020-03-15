package dev.idion.thinking.recursion;

import java.util.List;

public class LargestNumber {
    public int get(List<Integer> list) {
        return get(list, 0, Integer.MIN_VALUE);
    }

    private int get(List<Integer> list, int index, int largestNumber) {
        if (list.size() == index) {
            return largestNumber;
        }
        largestNumber = largestNumber < list.get(index) ? list.get(index) : largestNumber;
        return get(list, index + 1, largestNumber);
    }

}
