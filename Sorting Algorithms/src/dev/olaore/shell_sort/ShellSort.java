package dev.olaore.shell_sort;

import dev.olaore.utils.Utils;

public class ShellSort {

    public static void main(String[] args) {
        int[] numbers = Utils.numbers;

        for (int gap = numbers.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < numbers.length; i++) {

                int newElement = numbers[i];
                int j = i;

                while(j >= gap && newElement < numbers[j - gap]) {
                    numbers[j] = numbers[j - gap];
                    j -= gap;
                }

                numbers[j] = newElement;

            }

        }

        for (int number: numbers) {
            System.out.print(number + " ");
        }

    }

}
