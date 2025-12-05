package ru.fisher.Task4;

public class SortLevel {
    public static int ArrayChunk(int[] M) {
        int indN = M.length / 2;
        int N = M[indN];

        for (int i1 = 0, i2 = M.length - 1; ;) {
            for (; M[i1] < N; i1++) {}
            for (; M[i2] > N; i2--) {}

            if (i1 == i2 - 1 && M[i1] > M[i2]) {
                swap(M, i1, i2);
                return ArrayChunk(M);
            }

            if (i1 == i2 || ((i1 == i2 - 1) && (M[i1] < M[i2]))) {
                return indN;
            }

            swap(M, i1, i2);

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


