package com.vitalish.kata.alogorithms.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    @Test
    void sortsArray() {
        int[] arr = {4, 3, 6, 5, 1, 9, 7, 10};
        int[] expectedArr = {1, 3, 4, 5, 6, 7, 8, 10};
        BubbleSort bubbleSort = new BubbleSort();

        bubbleSort.sort(arr);

        Assertions.assertArrayEquals(expectedArr, arr);
    }
}