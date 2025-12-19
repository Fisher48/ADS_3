package ru.fisher.Task11;


public class BinarySearch {

    public int Left;

    public int Right;

    public int[] array;

    public int findVal;

    public BinarySearch(int[] arr) {
        this.array = arr;
        this.Left = 0;
        this.Right = array.length - 1;
        this.findVal = 0;
    }

    public void Step(int N) {
        if (findVal != 0) {
            return;
        }

        if (Left > Right || array == null) {
            findVal = -1;
            return;
        }

        int mid = (Left + Right) / 2;

        if (N == array[mid]) {
            findVal = 1;
            return;
        }
        if (N > array[mid]) {
            Left = mid + 1; // исключаем левую половину
        }
        if (N < array[mid]) {
            Right = mid - 1; // исключаем правую половину
        }

        // Проверка завершения
        if (Left > Right) {
            findVal = -1;
        }
        if (Left == Right) {
            // Остался один элемент
            findVal = (array[Left] == N) ? 1 : -1;
        }
        if (Right - Left == 1) {
            // Осталось два элемента
            findVal = (array[Left] == N || array[Right] == N) ? 1 : -1;
        }

    }

    public int GetResult() {
        return findVal;
    }

}


