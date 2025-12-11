package ru.fisher.Task7;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthOrderStatisticsStepTest {

    @Test
    void simpleTestKthOrderStatisticsStep() {
        int[] array = new int[] {1, 7, 2, 9, 0, -4, 2, 10};
        assertEquals(List.of(7, 7), SortLevel.KthOrderStatisticsStep(array, 0, array.length - 1, 7));
    }

    @Test
    void exampleTestKthOrderStatisticsStep() {
        int[] array = new int[] {3, 5, 2, 4, 1};
        assertEquals(List.of(0, 3), SortLevel.KthOrderStatisticsStep(array, 0, array.length - 1, 0));
    }

    @Test
    void testPivotIdxGreaterThenK() {
        int[] input = new int[] {7, 5, 6, 4, 3, 1, 2};
        ArrayList<Integer> newPositions = SortLevel.KthOrderStatisticsStep(input, 0, input.length - 1, 2);
        assertArrayEquals(new int[] {2, 1, 3, 4, 6, 5, 7}, input);
        assertEquals(List.of(0, 2), newPositions);
    }

    @Test
    void testPivotIdxLowerThenK() {
        int[] input = new int[] {5, -3, 0, 1, -6, -9, 24};
        ArrayList<Integer> newPositions = SortLevel.KthOrderStatisticsStep(input, 0, input.length - 1, 4);
        assertArrayEquals(new int[] {-9, -6, 0, -3, 1, 5, 24}, input);
        assertEquals(List.of(2, 6), newPositions);
    }

    @Test
    void testPivotIdxEqualsK() {
        int[] input = new int[] {2, 7, -1, 3, 0};
        ArrayList<Integer> newPositions = SortLevel.KthOrderStatisticsStep(input, 0, input.length - 1, 0);
        assertArrayEquals(new int[] {-1, 7, 2, 3, 0}, input);
        assertEquals(List.of(0, 0), newPositions);
    }

    @Test
    void testOneElementArray() {
        int[] input = new int[] {1};
        ArrayList<Integer> newPositions = SortLevel.KthOrderStatisticsStep(input, 0, input.length - 1, 0);
        assertArrayEquals(new int[] {1}, input);
        assertEquals(List.of(0, 0), newPositions);
    }
}
