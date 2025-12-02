package ru.fisher.Task1;

public class SortLevel {

    public static void SelectionSortStep(int[] array, int i) {
        if (i >= array.length) {
            return;
        }
        int minInd = i + 1;
        for (int j = i + 1; j < array.length - 1; j++) {
            if (array[j] < array[j + 1]) {
                minInd = j;
            }
        }
        if (array[i] > array[minInd]) {
            swapElements(array, i, minInd);
        }
    }

    public static void swapElements(int[] array, int i, int minInd) {
        int temp;
        temp = array[minInd];
        array[minInd] = array[i];
        array[i] = temp;
    }

    public static boolean BubbleSortStep(int[] array) {
        boolean isNotChanged = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                swapElements(array, i, i + 1);
                isNotChanged = false;
            }
        }
        return isNotChanged;
    }

}


