package dev.idion.thinking.recursion;

import java.util.List;

public class ListCount {
    public int count(List<Integer> list) {
        return count(list, 0, 0);
    }

    private int count(List<Integer> list, int index, int count) {
        if (list.size() == index) {
            return count;
        }
        return count(list, index + 1, count + 1);
    }
}
