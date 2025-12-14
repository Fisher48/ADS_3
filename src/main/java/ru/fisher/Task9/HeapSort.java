package ru.fisher.Task9;


public class HeapSort {
    Heap HeapObject;

    public HeapSort(int[] array) {
        HeapObject = new Heap();

        int depth = (int) (Math.log(array.length) / Math.log(2)) + 1;
        HeapObject.MakeHeap(new int[0], depth);

        for (int value : array) {
            HeapObject.Add(value);
        }
    }

    int GetNextMax() {
        return HeapObject.GetMax();
    }
}


class Heap {

    public int[] HeapArray;

    public Heap() {
        HeapArray = null;
    }

    public void MakeHeap(int[] a, int depth) {
        int heapSize = (1 << (depth + 1)) - 1;
        HeapArray = new int[heapSize];

        // Копируем элементы
        for (int i = 0; i < a.length && i < heapSize; i++) {
            HeapArray[i] = a[i];
        }

        // Строим кучу
        for (int i = heapSize / 2; i >= 0; i--) {
            HeapifyDown(i);
        }
    }

    public int GetMax() {
        if (HeapArray == null || HeapArray.length == 0 || HeapArray[0] == 0) {
            return -1;
        }

        int max = HeapArray[0];
        int lastIndex = HeapArray.length - 1;

        while (lastIndex >= 0 && HeapArray[lastIndex] == 0) {
            lastIndex--;
        }

        if (lastIndex < 0) {
            HeapArray[0] = 0;
            return max;
        }

        HeapArray[0] = HeapArray[lastIndex];
        HeapArray[lastIndex] = 0;
        HeapifyDown(0);

        return max;
    }

    public boolean Add(int key) {
        int i = 0;
        for (; i < HeapArray.length && HeapArray[i] != 0; i++) {}

        if (i >= HeapArray.length) {
            return false;
        }

        HeapArray[i] = key;
        HeapifyUp(i);
        return true;
    }

    private void HeapifyDown(int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < HeapArray.length && HeapArray[left] > HeapArray[largest]) {
            largest = left;
        }

        if (right < HeapArray.length && HeapArray[right] > HeapArray[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(i, largest);
            HeapifyDown(largest);
        }
    }

    private void HeapifyUp(int i) {
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (HeapArray[i] <= HeapArray[parent]) {
                break;
            }
            swap(i, parent);
            i = parent;
        }
    }

    private void swap(int i, int j) {
        int temp = HeapArray[i];
        HeapArray[i] = HeapArray[j];
        HeapArray[j] = temp;
    }

}
