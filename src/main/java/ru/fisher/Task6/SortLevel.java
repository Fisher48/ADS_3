package ru.fisher.Task6;

public class SortLevel {

    public static void QuickSortTailOptimization(int[] array, int left, int right) {
        for (; left < right; ) {
            int N = ArrayChunk(array, left, right);

            if ((N - left) < (right - N)) {
                QuickSortTailOptimization(array, left, N - 1);
                left = N + 1;
            } else {
                QuickSortTailOptimization(array, N + 1, right);
                right = N - 1;
            }
        }
    }

    public static int ArrayChunk(int[] array, int left, int right) {
        int indN = (left + right) / 2;
        int N = array[indN];

        int i1 = left;
        int i2 = right;

        for (; ;) {
            for (; array[i1] < N; i1++) { }
            for (; array[i2] > N; i2--) { }

            if (i1 == i2 - 1 && array[i1] > array[i2]) {
                swap(array, i1, i2);
                return ArrayChunk(array, left, right);
            }

            if (i1 == i2 || ((i1 == i2 - 1) && (array[i1] < array[i2]))) {
                return indN;
            }

            swap(array, i1, i2);

            if (i1 == indN) {
                indN = i2;
            } else if (i2 == indN) {
                indN = i1;
            }

        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

}


