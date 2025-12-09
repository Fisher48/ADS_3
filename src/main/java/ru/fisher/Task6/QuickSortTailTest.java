package ru.fisher.Task6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class QuickSortTailTest {

    @Test
    void testQuickSortTailOptimizationDescendingArray() {
        int[] array = new int[]{150, 100, 54, 12, 0, -5, -10, -12};
        SortLevel.QuickSortTailOptimization(array, 0, array.length-1);
        assertArrayEquals(array, Arrays.stream(array).sorted().toArray());
    }

    @Test
    void testQuickSortTailOptimizationSortedArray() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        SortLevel.QuickSortTailOptimization(array, 0, array.length-1);
        assertArrayEquals(array, Arrays.stream(array).sorted().toArray());
    }

    @Test
    void testQuickSortTailOptimization() {
        int[] input = new int[] {7, 5, 6, 4, 3, 1, 2};
        SortLevel.QuickSortTailOptimization(input, 0, input.length - 1);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7}, input);
    }

    @Test
    void testQuickSortTailOptimizationWithChangingOfPivot() {
        int[] input = new int[] {5, -3, 0, 1, -6, -9, 24};
        SortLevel.QuickSortTailOptimization(input, 0, input.length - 1);
        assertArrayEquals(new int[] {-9, -6, -3, 0, 1, 5, 24}, input);
    }

    @Test
    void testQuickSortTailOptimizationForOneElement() {
        int[] input = new int[] {7};
        SortLevel.QuickSortTailOptimization(input, 0, 0);
        assertArrayEquals(new int[] {7}, input);
    }

    @Test
    void testQuickSortTailOptimizationForTwoNotOrderedElements() {
        int[] input = new int[] {7, 3};
        SortLevel.QuickSortTailOptimization(input, 0, input.length - 1);
        assertArrayEquals(new int[] {3, 7}, input);
    }

    @Test
    void testQuickSortTailOptimizationForEmpty() {
        int[] input = new int[] {};
        SortLevel.QuickSortTailOptimization(input, 0, 0);
        assertArrayEquals(new int[] {}, input);
    }
}
