package ru.fisher.Task2;

public class SortLevel {

    public static void InsertionSortStep(int[] array, int step, int i) {
        for (int j = i + step; j < array.length; j += step) {
            int value = array[j];
            int k = j - step;

            for (; k >= i && array[k] > value; k -= step) {
                array[k + step] = array[k];
            }
            array[k + step] = value;
        }
    }

}


