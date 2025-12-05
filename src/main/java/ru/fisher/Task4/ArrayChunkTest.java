package ru.fisher.Task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayChunkTest {

    @Test
    void testArrayChunkExampleTest() {
        int[] array = new int[]{7, 5, 6, 4, 3, 1, 2};
        assertEquals(3, SortLevel.ArrayChunk(array));
        assertArrayEquals(new int[] {2, 1, 3, 4, 6, 5, 7}, array);
    }

    @Test
    void testArrayChunkWithHalfSeparationElementsFromReference() {
        int[] array = new int[]{13, 12, 11, 10, 9, 8, 7};
        assertEquals(3, SortLevel.ArrayChunk(array));
        assertArrayEquals(new int[] {7, 8, 9, 10, 11, 12, 13}, array);
    }

    @Test
    void testArrayChunkSorted() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        assertEquals(2, SortLevel.ArrayChunk(array));
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, array);
    }

    @Test
    void testArrayChunkWithChangingReferencePoint() {
        int[] input = new int[] {5, -3, 0, 1, -6, -9, 24};
        int supportIdx = SortLevel.ArrayChunk(input);
        assertEquals(1, supportIdx);
        assertArrayEquals(new int[] {-9, -6, 0, -3, 1, 5, 24}, input);
    }

    @Test
    void testArrayChunkForOneElement() {
        int[] input = new int[] {5};
        int supportIdx = SortLevel.ArrayChunk(input);
        assertEquals(0, supportIdx);
        assertArrayEquals(new int[] {5}, input);
    }

    @Test
    void testArrayChunkForThreeNotOrderedElements() {
        int[] input = new int[] {7, 3, 1};
        int supportIdx = SortLevel.ArrayChunk(input);
        assertEquals(1, supportIdx);
        assertArrayEquals(new int[] {1, 3, 7}, input);
    }
}
