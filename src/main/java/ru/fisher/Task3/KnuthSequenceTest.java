package ru.fisher.Task3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KnuthSequenceTest {

    @Test
    void testSequenceForEmptySize() {
        int arrSize = 0;
        assertEquals(List.of(), SortLevel.KnuthSequence(arrSize));
    }


    @Test
    void testSequenceForSizeOne() {
        int arrSize = 1;
        assertEquals(List.of(1), SortLevel.KnuthSequence(arrSize));
    }

    @Test
    void testSequenceForSizeFifteen() {
        int arrSize = 15;
        assertEquals(List.of(13, 4, 1), SortLevel.KnuthSequence(arrSize));
    }

    @Test
    void testSequenceForSizeSixty() {
        int arrSize = 60;
        assertEquals(List.of(40, 13, 4, 1), SortLevel.KnuthSequence(arrSize));
    }
    @Test
    void testSequenceForSizeOneHundredAndTwenty() {
        int arrSize = 120;
        assertEquals(List.of(40, 13, 4, 1), SortLevel.KnuthSequence(arrSize));
    }

    @Test
    void testSequenceForSizeTwoHundred() {
        int arrSize = 200;
        assertEquals(List.of(121, 40, 13, 4, 1), SortLevel.KnuthSequence(arrSize));
    }

    @Test
    void testSequenceForSizeFiveHundred() {
        int arrSize = 500;
        assertEquals(List.of(364, 121, 40, 13, 4, 1), SortLevel.KnuthSequence(arrSize));
    }
}
