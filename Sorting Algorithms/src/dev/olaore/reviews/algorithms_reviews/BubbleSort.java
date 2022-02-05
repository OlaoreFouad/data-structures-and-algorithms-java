package dev.olaore.reviews.algorithms_reviews;

import dev.olaore.utils.Utils;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = Utils.numbers;

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int index = 0; index < lastUnsortedIndex; index++) {
                if (array[index] > array[index + 1]) {
                    swap(array, index, index + 1);
                }
            }
        }

        for (int n: array) {
            System.out.print(n + " ");
        }

    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
