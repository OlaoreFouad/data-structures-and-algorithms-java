package dev.olaore.bubble_sort;

import dev.olaore.utils.Utils;

public class BubbleSortRewrite {

    private static Integer[] numbers = Utils.numbersBoxed;

    public static void main(String[] args) {

//        ascending order
        for (int lastUnsortedIndex = numbers.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int idx = 0; idx < lastUnsortedIndex; idx++) {
                if (numbers[idx] > numbers[idx+1]) {
                    swap(idx, idx + 1);
                }
            }
        }

        //        descending order
        for (int lastUnsortedIndex = 0; lastUnsortedIndex >= 0; lastUnsortedIndex++) {
            for (int index = numbers.length - 1; index > lastUnsortedIndex; index--) {
                if (numbers[index] > numbers[index - 1]) {
                    swap(index, index - 1);
                }
            }
        }

        Utils.print(numbers);

    }

    private static void swap(int i, int j) {

        if (numbers[i] == numbers[j]) {
            return;
        }

        if (numbers[i] > numbers[j]) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

    }

}
