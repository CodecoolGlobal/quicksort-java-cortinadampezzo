package com.codecool.quicksort;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 6, 5, 2, 3, 1, 4, 7, 9, 8);

        QuickSort quickSort = new QuickSort();
        quickSort.sort(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

}
