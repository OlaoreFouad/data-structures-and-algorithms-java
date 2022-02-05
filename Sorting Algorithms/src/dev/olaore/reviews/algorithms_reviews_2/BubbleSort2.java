package dev.olaore.reviews.algorithms_reviews_2;

import dev.olaore.utils.Utils;

public class BubbleSort2 {

    public static void main(String[] args) {

        Integer[] numbers = Utils.numbersBoxed;

        for (int lastUnsortedIndex = numbers.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int cnt = 0; cnt < lastUnsortedIndex; cnt++) {
                if (numbers[cnt] > numbers[cnt + 1]) {
                    swap(numbers, cnt, cnt + 1);
                }
            }
        }

        Utils.print(numbers);

    }

    private static void swap(Integer[] nums, int i, int j) {
        if (nums[i] == nums[j]) {
            return;
        }

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
