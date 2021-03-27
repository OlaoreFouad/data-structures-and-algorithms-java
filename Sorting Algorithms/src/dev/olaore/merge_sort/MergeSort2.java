package dev.olaore.merge_sort;

import dev.olaore.utils.Utils;

public class MergeSort2 {

    public static void main(String[] args) {

        int[] numbers = Utils.numbers;

        performSplit(numbers, 0, numbers.length);

        printNumbers(numbers);

    }

    private static void performSplit(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        performSplit(input, start, mid);
        performSplit(input, mid, end);
        merge(input, start, mid, end);

    }

    private static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[ end - start ];

        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, (start + tempIndex), mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);


    }

    private static void printNumbers(int[] array) {
        for (int element: array) {
            System.out.print(element + " ");
        }
    }

}
