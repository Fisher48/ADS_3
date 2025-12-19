package ru.fisher.Task12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GallopingSearchTest {

    @Test
    void binarySearchExampleTest() {
        int[] array = new int[]{1, 5, 8, 10, 20};
        int N = 10;
        BinarySearch binarySearch = new BinarySearch(array);
        assertTrue(binarySearch.GallopingSearch(array, N));
    }

    @Test
    void binarySearchNotExistingElementTest() {
        int[] array = new int[]{1, 5, 8, 10, 20};
        int N = 0;
        BinarySearch binarySearch = new BinarySearch(array);
        assertFalse(binarySearch.GallopingSearch(array, N));
    }

    @Test
    void binarySearchSortedArrayFindElementInMiddleTest() {
        int[] array = new int[]{0,1,2,3,4,5,6,7,8,9,10};
        int N = 5;
        BinarySearch binarySearch = new BinarySearch(array);
        assertTrue(binarySearch.GallopingSearch(array, N));
    }

    @Test
    void binarySearchSortedArrayFindElementInEndTest() {
        int[] array = new int[]{0,1,2,3,4,5,6,7,8,9,10};
        int N = 10;
        BinarySearch binarySearch = new BinarySearch(array);
        assertTrue(binarySearch.GallopingSearch(array, N));
    }

    @Test
    void binarySearchSortedArrayFindElementInZeroIndexTest() {
        int[] array = new int[]{0,1,2,3,4,5,6,7,8,9,10};
        int N = 0;
        BinarySearch binarySearch = new BinarySearch(array);
        assertTrue(binarySearch.GallopingSearch(array, N));
    }

    @Test
    void binarySearchEmptyArrayTest() {
        int[] array = new int[]{};
        int N = 7;
        BinarySearch binarySearch = new BinarySearch(array);
        assertFalse(binarySearch.GallopingSearch(array, N));
    }

    @Test
    void binarySearchOneElementInArrayTest() {
        int[] array = new int[]{7};
        int N = 7;
        BinarySearch binarySearch = new BinarySearch(array);
        assertTrue(binarySearch.GallopingSearch(array, N));
    }

    @Test
    void binarySearchOneElementWithRepeatableStepsForSearchingTest() {
        int[] array = new int[]{123,234,345,456,678,789};
        int N = 234;
        BinarySearch binarySearch = new BinarySearch(array);
        assertTrue(binarySearch.GallopingSearch(array, N));
    }
}


