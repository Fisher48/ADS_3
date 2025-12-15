package ru.fisher.Task9;


public class HeapSort {
    Heap HeapObject;

    public HeapSort(int[] array) {
        HeapObject = new Heap();

        if (array == null || array.length == 0) {
            // Пустая куча
            HeapObject.MakeHeap(array, 0);
            return;
        }

        int depth = (int) (Math.log(array.length) / Math.log(2)) + 1;
        HeapObject.MakeHeap(array, depth);

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
    public int size;

    public Heap() {
        HeapArray = null;
        size = 0;
    }

    public void MakeHeap(int[] a, int depth) {
        int heapSize = (int) Math.pow(2, depth + 1) - 1;
        HeapArray = new int[heapSize];
        size = 0;
    }

    public int GetMax() {
        if (size == 0) {
            return -1;
        }

        int max = HeapArray[0];
        size--;
        HeapArray[0] = HeapArray[size];
        HeapArray[size] = 0;
        siftDown(0);

        return max;
    }

    public boolean Add(int key) {
        if (size >= HeapArray.length) {
            return false; // куча заполнена
        }
        HeapArray[size] = key;
        siftUp(size);
        size++;
        return true;
    }

    private void siftDown(int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && HeapArray[left] > HeapArray[largest]) {
            largest = left;
        }

        if (right < size && HeapArray[right] > HeapArray[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(i, largest);
            siftDown(largest);
        }
    }

    private void siftUp(int i) {
        for ( ; i > 0; ) {
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


