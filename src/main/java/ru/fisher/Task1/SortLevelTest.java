package ru.fisher.Task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SortLevelTest {

    @Test
    void testNotSortedArrayShouldChangeOneElement() {
        int[] arr = new int[]{1, 7, 12, 0, 5};
        int index = 2;
        SortLevel.SelectionSortStep(arr, index);
        assertArrayEquals(new int[]{1, 7, 0, 12, 5}, arr);
    }

    @Test
    void testWithNotSortedArrayWithNegativeElementsAndPositiveShouldChangeOneElement() {
        int[] arr = new int[]{1, -7, 12, 10, -5};
        int index = 3;
        SortLevel.SelectionSortStep(arr, index);
        assertArrayEquals(new int[]{1, -7, 12, -5, 10}, arr);
    }

    @Test
    void testSortedArrayShouldNotChangeOneElement() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int index = 1;
        SortLevel.SelectionSortStep(arr, index);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testSortedArrayWithOnlyNegativeElementsShouldNotChangeOneElement() {
        int[] arr = new int[]{-12, -10, -8, -6, -2};
        int index = 3;
        SortLevel.SelectionSortStep(arr, index);
        assertArrayEquals(new int[]{-12, -10, -8, -6, -2}, arr);
    }

    @Test
    void testWithEmptyArrayShouldNotChangeAnyElement() {
        int[] arr = new int[]{};
        int index = 2;
        SortLevel.SelectionSortStep(arr, index);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void testBubbleSortShouldChangeElement() {
        int[] arr = new int[]{1, -7, 12, 10, -5};
        assertFalse(SortLevel.BubbleSortStep(arr));
    }

    @Test
    void testBubbleSortShouldNotChangeElement() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        assertTrue(SortLevel.BubbleSortStep(arr));
    }

    @Test
    void testBubbleSortForEmptyArray() {
        int[] arr = new int[]{};
        assertTrue(SortLevel.BubbleSortStep(arr));
    }
}
