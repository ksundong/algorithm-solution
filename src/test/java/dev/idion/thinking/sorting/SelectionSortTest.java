package dev.idion.thinking.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SelectionSortTest {

    @Test
    void sort() {
        SelectionSort selectionSort = new SelectionSort();
        int[] input = {1, 4, 5, 7, 2, 4, 3, 1};
        int[] expected = {1, 1, 2, 3, 4, 4, 5, 7};
        selectionSort.sort(input);
        assertArrayEquals(expected, input, "정렬에 실패했습니다.");
    }
}