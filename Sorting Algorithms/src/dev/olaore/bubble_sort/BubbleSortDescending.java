package dev.olaore.bubble_sort;

public class BubbleSortDescending {

    public static void main(String[] args) {

        int[] numbers = { 7, -9, 10, 23, -35, 55, 100, -1, 2 };

        for (int lastUnsortedIndex = 0; lastUnsortedIndex >= 0; lastUnsortedIndex++) {
            for (int index = numbers.length - 1; index > lastUnsortedIndex; index--) {
                if (numbers[index] > numbers[index - 1]) {
                    swap(numbers, index, index - 1);
                }
            }
        }

        for (int number: numbers) {
            System.out.print(number + " ");
        }

    }

    private static void swap(int[] numbers, int i, int j) {
        if (numbers[i] == numbers[j]) {
            return;
        }

        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;

    }

}
