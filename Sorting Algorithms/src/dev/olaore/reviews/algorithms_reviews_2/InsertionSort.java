package dev.olaore.reviews.algorithms_reviews_2;

import dev.olaore.utils.Utils;

public class InsertionSort {

    public static void main(String[] args) {

        Integer[] numbers = Utils.numbersBoxed;

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < numbers.length; firstUnsortedIndex++) {

            int element = numbers[firstUnsortedIndex];
            int index;

            for (index = firstUnsortedIndex; index > 0 && numbers[index - 1] > element; index--) {
                numbers[index] = numbers[index - 1];
            }

            numbers[index] = element;

        }

        Utils.print(numbers);

    }

}
