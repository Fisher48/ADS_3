package ru.fisher.Task3;

import java.util.ArrayList;
import java.util.List;

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

    public static ArrayList<Integer> KnuthSequence(int array_size) {
        ArrayList<Integer> list = new ArrayList<>();
        int N = 1;
        while (N <= array_size) {
            list.addFirst(N);
            N = 3 * N + 1;
        }
        return list;
    }

    public static void ShellSort(int[] array) {
        List<Integer> list = KnuthSequence(array.length);
        for (Integer step : list) {
            for (int j = 0; j < step; j++) {
                InsertionSortStep(array, step, j);
            }
        }
    }

}


