package dev.olaore.reviews.algorithms_reviews;

import dev.olaore.utils.Utils;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array = Utils.numbers;

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largestIndex = 0;

            for (int index = 0; index <= lastUnsortedIndex; index++) {
                if (array[index] > array[largestIndex]) {
                    largestIndex = index;
                }
            }

            swap(array, largestIndex, lastUnsortedIndex);

        }

        for (int n: array) {
            System.out.print(n + " ");
        }

    }

    private static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
