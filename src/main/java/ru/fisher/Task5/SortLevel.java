package ru.fisher.Task5;

public class SortLevel {

    // Рекурсивная функция QuickSort() получает на вход массив (по ссылке) и два параметра: left и right,
    // которые по сути имеют смысл левого и правого индексов в алгоритме разбиения.
    // Сперва мы проверяем, если left и right равны, значит сортировка закончена (массив из одного элемента упорядочен по определению).
    // В противном случае мы сначала вызываем из прошлого занятия алгоритм разбиения для диапазона значений left .. right,
    // который вносит соответствующие изменения в этот диапазон (разбивает его на два поддиапазона), и возвращает индекс N опорного элемента.
    // Теперь естественным образом слева от опорного элемента будут находиться заведомо меньшие элементы,
    // а справа заведомо большие. Мы можем считать, что наш опорный элемент уже находится в "отсортированном" месте, и из дальнейшего разбиения его можно исключить.
    // Поэтому двумя следующими шагами после разбиения мы просто вызываем
    // QuickSort( array, left, N-1 )
    // QuickSort( array, N+1, right )
    // где N -- это индекс опорного элемента.

    public static void QuickSort(int[] array, int left, int right) {
        if (left >= right) return;
        int N = ArrayChunk(array, left, right);
        QuickSort(array, left, N - 1);
        QuickSort(array, N + 1, right);
    }
    public static int ArrayChunk(int[] M, int left, int right) {
        int indN = (left + right) / 2;
        int N = M[indN];

        int i1 = left;
        int i2 = right;

        for (; ;) {
            for (; M[i1] < N; i1++) {}
            for (; M[i2] > N; i2--) {}

            if (i1 == i2 - 1 && M[i1] > M[i2]) {
                swap(M, i1, i2);
                return ArrayChunk(M, left, right);
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
