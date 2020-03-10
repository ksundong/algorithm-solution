package dev.idion.thinking.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTest {
    BinarySearch binarySearch;

    @BeforeEach
    void setUp() {
        binarySearch = new BinarySearch();
    }

    @Test
    void testSearchRecursive1() {
        int[] arr = {1, 3, 5, 7, 8, 13, 23, 34};
        int target = 23;
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        int expected = 6;
        int actual = binarySearch.searchRecursive(arr, target, firstIndex, lastIndex);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSearchRecursive2() {
        int[] arr = {1, 3, 5, 7, 8, 13, 23, 34};
        int target = 43;
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        int expected = -1;
        int actual = binarySearch.searchRecursive(arr, target, firstIndex, lastIndex);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSearch1() {
        int[] arr = {1, 3, 5, 7, 8, 13, 23, 34};
        int target = 23;
        int expected = 6;
        int actual = binarySearch.search(arr, target);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSearch2() {
        int[] arr = {1, 3, 5, 7, 8, 13, 23, 34};
        int target = 43;
        int expected = -1;
        int actual = binarySearch.search(arr, target);
        assertThat(actual).isEqualTo(expected);
    }
}
