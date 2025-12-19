package ru.fisher.Task11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    void binarySearchExampleTest() {
        int[] array = new int[]{1, 5, 8, 10, 20};
        int N = 10;
        BinarySearch binarySearch = new BinarySearch(array);
        binarySearch.Step(N);
        assertEquals(1, binarySearch.GetResult());
    }

    @Test
    void binarySearchNotExistingElementTest() {
        int[] array = new int[]{1, 5, 8, 10, 20};
        int N = 0;
        BinarySearch binarySearch = new BinarySearch(array);
        binarySearch.Step(N);
        assertEquals(-1, binarySearch.GetResult());
    }

    @Test
    void binarySearchSortedArrayFindElementInMiddleTest() {
        int[] array = new int[]{0,1,2,3,4,5,6,7,8,9,10};
        int N = 5;
        BinarySearch binarySearch = new BinarySearch(array);
        binarySearch.Step(N);
        assertEquals(1, binarySearch.GetResult());
    }

    @Test
    void binarySearchSortedArrayFindElementInEndTest() {
        int[] array = new int[]{0,1,2,3,4,5,6,7,8,9,10};
        int N = 10;
        BinarySearch binarySearch = new BinarySearch(array);
        binarySearch.Step(N);
        assertEquals(0, binarySearch.GetResult());
        binarySearch.Step(N);
        assertEquals(1, binarySearch.GetResult());
        binarySearch.Step(N);
        assertEquals(1, binarySearch.GetResult());
    }

    @Test
    void binarySearchSortedArrayFindElementInZeroIndexTest() {
        int[] array = new int[]{0,1,2,3,4,5,6,7,8,9,10};
        int N = 0;
        BinarySearch binarySearch = new BinarySearch(array);
        binarySearch.Step(N);
        assertEquals(0, binarySearch.GetResult());
        binarySearch.Step(N);
        assertEquals(1, binarySearch.GetResult());
    }

    @Test
    void binarySearchEmptyArrayTest() {
        int[] array = new int[]{};
        int N = 7;
        BinarySearch binarySearch = new BinarySearch(array);
        binarySearch.Step(N);
        assertEquals(-1, binarySearch.GetResult());
    }

    @Test
    void binarySearchOneElementInArrayTest() {
        int[] array = new int[]{7};
        int N = 7;
        BinarySearch binarySearch = new BinarySearch(array);
        binarySearch.Step(N);
        assertEquals(1, binarySearch.GetResult());
    }

    @Test
    void binarySearchOneElementWithRepeatableStepsForSearchingTest() {
        int[] array = new int[]{123,234,345,456,678,789};
        int N = 234;
        BinarySearch binarySearch = new BinarySearch(array);
        binarySearch.Step(N);
        assertEquals(1, binarySearch.GetResult());
        binarySearch.Step(N);
        assertEquals(1, binarySearch.GetResult());
        binarySearch.Step(N);
        assertEquals(1, binarySearch.GetResult());
    }

}


