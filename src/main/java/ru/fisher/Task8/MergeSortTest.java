package ru.fisher.Task8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortTest {

    @Test
    public void mergeSortExampleTest() {
        ArrayList<Integer> list = new ArrayList<>(List.of(6,3,1,0,4,8));
        assertEquals(new ArrayList<>(List.of(0,1,3,4,6,8)), SortLevel.MergeSort(list));
    }

    @Test
    public void mergeSortSortedArrayTest() {
        ArrayList<Integer> list = new ArrayList<>(List.of(0,1,2,3,4,5));
        assertEquals(new ArrayList<>(List.of(0,1,2,3,4,5)), SortLevel.MergeSort(list));
    }

    @Test
    public void mergeSortDescendingArrayTest() {
        ArrayList<Integer> list = new ArrayList<>(List.of(10,9,8,7,6,5,4,3,2,1,0));
        assertEquals(new ArrayList<>(List.of(0,1,2,3,4,5,6,7,8,9,10)), SortLevel.MergeSort(list));
    }

    @Test
    public void mergeSortEmptyArrayTest() {
        ArrayList<Integer> list = new ArrayList<>(List.of());
        assertEquals(new ArrayList<>(List.of()), SortLevel.MergeSort(list));
    }

    @Test
    public void mergeSortOneElementTest() {
        ArrayList<Integer> list = new ArrayList<>(List.of(123));
        assertEquals(new ArrayList<>(List.of(123)), SortLevel.MergeSort(list));
    }

    @Test
    public void mergeSortWithNegativeElementsTest() {
        ArrayList<Integer> list = new ArrayList<>(List.of(-6, 3, 1, 0, -4, -8));
        assertEquals(new ArrayList<>(List.of(-8, -6, -4, -0, 1, 3)), SortLevel.MergeSort(list));
    }

}


