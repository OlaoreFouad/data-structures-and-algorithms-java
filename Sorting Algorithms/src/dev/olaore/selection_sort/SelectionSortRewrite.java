package dev.olaore.selection_sort;

import dev.olaore.utils.Utils;

public class SelectionSortRewrite {

    private static Integer[] numbers = Utils.numbersBoxed;

    public static void main(String[] args) {

        for (int lastUnsortedIndex = numbers.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largestIndex = 0;
            for (int index = 1; index <= lastUnsortedIndex; index++) {
                if (numbers[index] > numbers[largestIndex]) {
                    largestIndex = index;
                }
            }

            swap(largestIndex, lastUnsortedIndex);

        }

        Utils.print(numbers);

    }

    private static void swap(int i, int j) {

        if (i == j) {
            return;
        }

        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;

    }

}
