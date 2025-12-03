package ru.fisher.Task3;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortLevelTest {

    @Test
    void testShellSortWithSortedArray(){
        int[] arr = new int[]{1, 2, 3, 4, 5};
        SortLevel.ShellSort(arr);
        assertArrayEquals(arr, new int[]{1, 2, 3, 4, 5});
    }

    @Test
    void testShellSortWithDescendingArray(){
        int[] arr = new int[]{5, 4, 3, 2, 1};
        SortLevel.ShellSort(arr);
        assertArrayEquals(arr, new int[]{1, 2, 3, 4, 5});
    }

    @Test
    void testShellSortWithNegativeAndPositiveElements(){
        int[] arr = new int[]{7, -6, 51, 47, -30, 25, 0, -12};
        SortLevel.ShellSort(arr);
        assertArrayEquals(arr, new int[]{-30, -12, -6, 0, 7, 25, 47, 51});
    }

    @Test
    void testShellSortWithExampleFromTask(){
        int[] arr = new int[]{7, 6, 5, 4, 3, 2, 1};
        SortLevel.ShellSort(arr);
        assertArrayEquals(arr, new int[]{1, 2, 3, 4, 5, 6, 7});
    }

    @Test
    void testShellSortWithRepetitiveElements(){
        int[] arr = new int[]{6, 12, 6, 7, 0, 0, -5, -5};
        SortLevel.ShellSort(arr);
        assertArrayEquals(arr, new int[]{-5, -5, 0, 0, 6, 6, 7, 12});
    }

}
