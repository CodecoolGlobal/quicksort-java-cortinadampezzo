package com.codecool.quicksort;

import java.util.List;

public class QuickSort {

    private void quickSort(List<Integer> toSort, int leftIndex, int rightIndex) {

        int leftNumber = leftIndex;
        int rightNumber = rightIndex;

        while (toSort.get(leftNumber) < toSort.get(leftIndex + (rightIndex - leftIndex) / 2)) {
            leftNumber++;
        }

        while (toSort.get(rightNumber) > toSort.get(leftIndex + (rightIndex - leftIndex) / 2)) {
            rightNumber--;
        }

        int temporaryLeft = toSort.get(leftNumber);
        int temporaryRight = toSort.get(rightNumber);
        toSort.set(leftNumber, temporaryRight);
        toSort.set(rightNumber, temporaryLeft);
        leftNumber++;
        rightNumber--;


        if (leftIndex < rightNumber) {
            quickSort(toSort, leftIndex, rightNumber);
        }
        if (leftNumber < rightIndex) {
            quickSort(toSort, leftNumber, rightIndex);
        }
    }

    public void sort(List<Integer> toSort) {

        if (toSort == null) throw new IllegalArgumentException();
        quickSort(toSort, 0, toSort.size() - 1);
    }

}
