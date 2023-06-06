package ru.chernov.algorythms;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public List<Integer> sort(List<Integer> list) {
        if (list.size() < 2) {
            return list;
        } else {
            int pivot = list.get(0);
            List<Integer> left = new ArrayList<>();
            List<Integer> right = new ArrayList<>();
            for (int i = 1; i < list.size(); i++) {
                int e = list.get(i);
                if (list.get(i) <= pivot) {
                    left.add(e);
                } else {
                    right.add(e);
                }
            }

            List<Integer> sortedLeft = sort(left);
            sortedLeft.add(pivot);
            List<Integer> sortedRight = sort(right);
            sortedLeft.addAll(sortedRight);

            return sortedLeft;
        }
    }
}
