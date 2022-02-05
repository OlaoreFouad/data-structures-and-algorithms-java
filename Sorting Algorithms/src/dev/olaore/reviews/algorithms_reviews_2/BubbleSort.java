package dev.olaore.reviews.algorithms_reviews_2;

import dev.olaore.utils.Utils;

public class BubbleSort {

    public static void main(String[] args) {

        int[] numbers = Utils.numbers;

        for (int lastUnsortedIndex = numbers.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int cnt = 0; cnt < lastUnsortedIndex; cnt++) {
                if (numbers[cnt] > numbers[cnt + 1]) {
                    swap(numbers, cnt, cnt + 1);
                }
            }
        }

        printNumbers(numbers);

    }

    private static void swap(int[] array, int i, int j) {
        if (array[i] == array[j]) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printNumbers(int[] array) {
        for (int number: array) {
            System.out.print(number + " ");
        }
    }

}
