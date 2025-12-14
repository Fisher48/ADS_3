package ru.fisher.Task8;

import java.util.ArrayList;

public class SortLevel {

    public static ArrayList<Integer> MergeSort(ArrayList<Integer> list) {
        if (list.size() <= 1) {
            return new ArrayList<>(list);
        }

        int mid = list.size() / 2;
        ArrayList<Integer> left = MergeSort(new ArrayList<>(list.subList(0, mid)));
        ArrayList<Integer> right = MergeSort(new ArrayList<>(list.subList(mid, list.size())));

        ArrayList<Integer> result = new ArrayList<>(left.size() + right.size());
        int i = 0;
        int j = 0;
        for (; i != left.size() && j != right.size(); ) {
            if (left.get(i) <= right.get(j)) {
                result.add(left.get(i));
                i++;
                continue;
            }
            result.add(right.get(j));
            j++;
        }
        for (; i < left.size(); i++) {
            result.add(left.get(i));
        }
        for (; j < right.size(); j++) {
            result.add(right.get(j));
        }
        return result;
    }

}


