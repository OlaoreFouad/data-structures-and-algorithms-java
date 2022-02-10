package dev.olaore.shell_sort;

import dev.olaore.utils.Utils;

public class ShellSort {

    public static void main(String[] args) {
        int[] numbers = Utils.numbers;

        for (int gap = numbers.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < numbers.length; i++) {

                int j = i;

                int newElement = numbers[j];

                while (j > 0 && numbers[j - gap] > newElement) {
                    numbers[j] = numbers[j - gap];
                    j -= gap;
                }

                numbers[j] = newElement;

            }

        }

        print(numbers);
    }

    private static void print(int[] nums) {
        for (int n: nums) {
            System.out.println(n);
        }
    }

}
