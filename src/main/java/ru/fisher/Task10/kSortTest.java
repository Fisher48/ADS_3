package ru.fisher.Task10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class kSortTest {

    @Test
    void kSortExampleTest() {
        ksort ksort = new ksort();
        assertTrue(ksort.add("g99"));
        assertTrue(ksort.add("b64"));
        assertTrue(ksort.add("a01"));
        assertTrue(ksort.add("h99"));
        assertEquals(0, ksort.index("a00"));
        System.out.println(ksort.index("a01"));
        System.out.println(ksort.index("b64"));
        System.out.println(ksort.index("g99"));
        System.out.println(ksort.index("h99"));
    }

    @Test
    void kSortRepeatableCharsTest() {
        ksort ksort = new ksort();
        assertTrue(ksort.add("d55"));
        assertTrue(ksort.add("d55"));
        assertTrue(ksort.add("d55"));
        System.out.println(ksort.index("d55"));
    }

    @Test
    void kSortNonPatternCharsTest() {
        ksort ksort = new ksort();
        assertFalse(ksort.add("dd55"));
        assertFalse(ksort.add("d525"));
        assertFalse(ksort.add("012"));
        assertEquals(-1, ksort.index("dd55"));
        assertEquals(-1, ksort.index("d525"));
        assertEquals(-1, ksort.index("012"));
    }

    @Test
    void kSortNonOutOfRangeCharsTest() {
        ksort ksort = new ksort();
        assertFalse(ksort.add("y55"));
        assertFalse(ksort.add("z99"));
        assertFalse(ksort.add("m12"));
        assertEquals(-1, ksort.index("z99"));
        assertEquals(-1, ksort.index("m12"));
        assertEquals(-1, ksort.index("y55"));
    }


}
