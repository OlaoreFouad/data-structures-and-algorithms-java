package dev.olaore.reviews.algorithms_reviews;

import dev.olaore.utils.Utils;

public class ShellSort {

    public static void main(String[] args) {

        int[] numbers = Utils.numbers;

        for (int gap = numbers.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < numbers.length; i++) {

                int currentElement = numbers[i];

                int j = i;

                while(j > 0 && numbers[j - gap] > currentElement) {
                    numbers[j] = numbers[j - gap];
                    j -= gap;
                }

                numbers[j] = currentElement;
            }

        }

        print(numbers);

    }

    private static void print(int[] array) {
        for (int el: array) {
            System.out.print(el + " ");
        }
    }

}
