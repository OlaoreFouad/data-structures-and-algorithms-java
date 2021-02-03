package dev.olaore.insertion_sort;

public class InsertionSort {

    public static void main(String[] args) {

        int[] numbers = { 20, 35, 55, 7, -15, -11, 22, 40, 1 };

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < numbers.length; firstUnsortedIndex++) {

            int newElement = numbers[firstUnsortedIndex];
            int index;

            for (index = firstUnsortedIndex; index > 0 && numbers[index - 1] > newElement; index--) {
                numbers[index] = numbers[index - 1];
            }

            numbers[index] = newElement;

        }

        for (int number: numbers) {
            System.out.print(number + " ");
        }

    }

}
