package ru.fisher.Task5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest {

    @Test
    void testQuicksortDescendingArray() {
        int[] array = new int[]{150, 100, 54, 12, 0, -5, -10, -12};
        SortLevel.QuickSort(array, 0, array.length-1);
        assertArrayEquals(array, Arrays.stream(array).sorted().toArray());
    }

    @Test
    void testQuicksortSortedArray() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        SortLevel.QuickSort(array, 0, array.length-1);
        assertArrayEquals(array, Arrays.stream(array).sorted().toArray());
    }

    @Test
    void testArrayChunk() {
        int[] input = new int[] {7, 5, 6, 4, 3, 1, 2};
        SortLevel.QuickSort(input, 0, input.length - 1);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7}, input);
    }

    @Test
    void testArrayChunkWithChangingOfPivot() {
        int[] input = new int[] {5, -3, 0, 1, -6, -9, 24};
        SortLevel.QuickSort(input, 0, input.length - 1);
        assertArrayEquals(new int[] {-9, -6, -3, 0, 1, 5, 24}, input);
    }

    @Test
    void testArrayChunkForOneElement() {
        int[] input = new int[] {7};
        SortLevel.QuickSort(input, 0, 0);
        assertArrayEquals(new int[] {7}, input);
    }

    @Test
    void testArrayChunkForTwoNotOrderedElements() {
        int[] input = new int[] {7, 3};
        SortLevel.QuickSort(input, 0, input.length - 1);
        assertArrayEquals(new int[] {3, 7}, input);
    }

    @Test
    void testArrayChunkForEmpty() {
        int[] input = new int[] {};
        SortLevel.QuickSort(input, 0, 0);
        assertArrayEquals(new int[] {}, input);
    }

}
