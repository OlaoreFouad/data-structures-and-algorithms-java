package dev.olaore.insertion_sort;

import dev.olaore.utils.Utils;

public class InsertionSort {

    public static void main(String[] args) {

        int[] numbers = Utils.numbers;

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < numbers.length; firstUnsortedIndex++) {

            int newElement = numbers[firstUnsortedIndex]; // get the first unsorted element.

            int index; // the index to loop through the sorted partition of the array.

            // loop through the sorted partition starting from the first unsorted index(the end of the sorted partition)
            // keep looping as long as the index is more than 0 (not at the front of the array) and as long as the previous
            // element is more than the element to be inserted (meaning a shift has to occur for the element to be
            // correctly placed.
            for (index = firstUnsortedIndex; index > 0 && numbers[index - 1] > newElement; index--) {
                numbers[index] = numbers[index - 1];
            }

            numbers[index] = newElement;

        }

        print(numbers);

    }

    private static void print(int[] numbers) {
        for (int n: numbers) {
            System.out.println(n);
        }
    }

}
