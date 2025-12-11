package ru.fisher.Task7;

import java.util.ArrayList;

public class SortLevel {

    public static ArrayList<Integer> KthOrderStatisticsStep(int[] Array, int L, int R, int k) {
       ArrayList<Integer> positions = new ArrayList<>(2);
       if (L > R) {
           return positions;
       }
       int N = ArrayChunk(Array, L, R);
       if (N == k) {
           positions.add(N);
           positions.add(N);
           return positions;
       }
       if (N < k) {
           L = N + 1;
           positions.add(L);
           positions.add(R);
           return positions;
       }
       R = N - 1;
       positions.add(L);
       positions.add(R);
       return positions;
    }

    public static int ArrayChunk(int[] M, int left, int right) {
        int indN = (right + left) / 2;
        int N = M[indN];

        for (int i1 = left, i2 = right; ;) {
            for (; M[i1] < N; i1++) {}
            for (; M[i2] > N; i2--) {}

            if (i1 == i2 - 1 && M[i1] > M[i2]) {
                swap(M, i1, i2);
                indN = (right + left) / 2;
                N = M[indN];
                i1 = left;
                i2 = right;
                continue;
            }

            if ((i1 == i2) || ((i1 == i2 - 1) && (M[i1] < M[i2]))) {
                return indN;
            }

            swap(M, i1, i2);

            if (i1 == indN) {
                indN = i2;
            } else if (i2 == indN) {
                indN = i1;
            }
            N = M[indN];
        }
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

}
