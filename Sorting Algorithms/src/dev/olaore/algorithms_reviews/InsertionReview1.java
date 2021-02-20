package dev.olaore.algorithms_reviews;

import dev.olaore.utils.Utils;

public class InsertionReview1 {

    public static void main(String[] args) {

        int[] array = Utils.numbers;

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {

            int newElement = array[firstUnsortedIndex];
            int index;

            for (index = firstUnsortedIndex; index > 0 && newElement < array[index - 1]; index--) {
                array[index] = array[index - 1];
            }

            array[index] = newElement;

        }

        for (int number: array) {
            System.out.print(number + " ");
        }

    }

}
