package ru.fisher.Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortLevelTest {

    @Test
    void testAscendingArrayChangedAllElements(){
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int step = 1;
        SortLevel.InsertionSortStep(arr, step, 0);
        assertArrayEquals(arr, new int[]{1, 2, 3, 4, 5});
    }

    @Test
    void testDescendingArrayChangedAllElements(){
        int[] arr = new int[]{5, 4, 3, 2, 1};
        int step = 1;
        SortLevel.InsertionSortStep(arr, step, 0);
        assertArrayEquals(arr, new int[]{1, 2, 3, 4, 5});
    }

    @Test
    void testArrayWithStepsTwo(){
        int[] arr = new int[]{7, 6, 5, 4, 3, 2, 1};
        int step = 2;
        SortLevel.InsertionSortStep(arr, step, 0);
        assertArrayEquals(arr, new int[]{1, 6, 3, 4, 5, 2, 7});
    }

    @Test
    void testArrayWithStepsThree(){
        int[] arr = new int[]{7, 6, 5, 4, 3, 2, 1};
        int step = 3;
        SortLevel.InsertionSortStep(arr, step, 0);
        assertArrayEquals(arr, new int[]{1, 6, 5, 4, 3, 2, 7});
    }

    @Test
    void testFromExample(){
        int[] arr = new int[]{1, 6, 5, 4, 3, 2, 7};
        int step = 3;
        SortLevel.InsertionSortStep(arr, step, 1);
        assertArrayEquals(arr, new int[]{1, 3, 5, 4, 6, 2, 7});
    }
}
