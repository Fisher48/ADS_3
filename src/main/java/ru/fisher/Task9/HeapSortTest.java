package ru.fisher.Task9;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeapSortTest {

    @Test
    void heapSortSimpleTest() {
        int[] arr = {9, 3, 1, 20, 12, 32};
        HeapSort heapSort = new HeapSort(arr);
        heapSort.HeapObject.MakeHeap(arr, 5);
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
}
