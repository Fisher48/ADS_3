package ru.fisher.Task9;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeapSortTest {

    @Test
    void heapSortSimpleTest() {
        int[] arr = {9, 3, 1, 20, 12, 32};
        HeapSort heapSort = new HeapSort(arr);
        System.out.println(Arrays.toString(arr));
        assertEquals(32,heapSort.GetNextMax());
        assertEquals(20,heapSort.GetNextMax());
        assertEquals(12,heapSort.GetNextMax());
        assertEquals(9,heapSort.GetNextMax());
        assertEquals(3,heapSort.GetNextMax());
        assertEquals(1,heapSort.GetNextMax());
        assertEquals(-1,heapSort.GetNextMax());
        System.out.println(Arrays.toString(heapSort.HeapObject.HeapArray));
    }

    @Test
    void heapSortEmptyArray() {
        int[] arr = {};
        HeapSort heapSort = new HeapSort(arr);
        assertEquals(-1, heapSort.GetNextMax());
    }

    @Test
    void heapSortSingleElement() {
        int[] arr = {123};
        HeapSort heapSort = new HeapSort(arr);
        assertEquals(123, heapSort.GetNextMax());
        assertEquals(-1, heapSort.GetNextMax());
    }

    @Test
    void heapSortSortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        HeapSort heapSort = new HeapSort(arr);
        assertEquals(5, heapSort.GetNextMax());
        assertEquals(4, heapSort.GetNextMax());
        assertEquals(3, heapSort.GetNextMax());
        assertEquals(2, heapSort.GetNextMax());
        assertEquals(1, heapSort.GetNextMax());
        assertEquals(-1, heapSort.GetNextMax());
    }

    @Test
    void heapSortReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        HeapSort heapSort = new HeapSort(arr);
        assertEquals(5, heapSort.GetNextMax());
        assertEquals(4, heapSort.GetNextMax());
        assertEquals(3, heapSort.GetNextMax());
        assertEquals(2, heapSort.GetNextMax());
        assertEquals(1, heapSort.GetNextMax());
        assertEquals(-1, heapSort.GetNextMax());
    }

    @Test
    void heapSortDuplicateElements() {
        int[] arr = {7, 7, 7, 7, 7};
        HeapSort heapSort = new HeapSort(arr);
        assertEquals(7, heapSort.GetNextMax());
        assertEquals(7, heapSort.GetNextMax());
        assertEquals(7, heapSort.GetNextMax());
        assertEquals(7, heapSort.GetNextMax());
        assertEquals(7, heapSort.GetNextMax());
        assertEquals(-1, heapSort.GetNextMax());
    }

    @Test
    void heapSortWithZeros() {
        int[] arr = {5, 0, 3, 0, 1};
        HeapSort heapSort = new HeapSort(arr);
        assertEquals(5, heapSort.GetNextMax());
        assertEquals(3, heapSort.GetNextMax());
        assertEquals(1, heapSort.GetNextMax());
        assertEquals(0, heapSort.GetNextMax());
        assertEquals(0, heapSort.GetNextMax());
        assertEquals(-1, heapSort.GetNextMax());
    }
}
