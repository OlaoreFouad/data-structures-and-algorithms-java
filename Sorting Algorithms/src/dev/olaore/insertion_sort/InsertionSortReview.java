package dev.olaore.insertion_sort;

public class InsertionSortReview {

    public static void main(String[] args) {

        int[] array = { 22, -2, 3, 1, 0, 10, -40, 2, -11 };

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {

            int newElement = array[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && newElement < array[i - 1]; i--) {
                array[i] = array[i - 1];
            }

            array[i] = newElement;

        }

        for (int n: array) {
            System.out.print(n + " ");
        }

    }

}
