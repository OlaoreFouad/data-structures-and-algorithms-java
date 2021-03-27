package dev.olaore.quick_sort;

import dev.olaore.utils.Utils;

public class QuickSort {

    public static void main(String[] args) {

        int[] numbers = Utils.numbers;
        quickSort(numbers, 0, numbers.length);

        printNumbers(numbers);
    }

    private static void quickSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);

    }

    private static int partition(int[] input, int start, int end) {

        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            while(i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }

            while(i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }

        }

        input[j] = pivot;
        return j;

    }

    private static void printNumbers(int[] numbers) {
        for (int number: numbers) {
            System.out.print(number + " ");
        }
    }

}
