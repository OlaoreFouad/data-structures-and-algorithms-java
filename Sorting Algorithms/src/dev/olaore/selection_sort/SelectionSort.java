package dev.olaore.selection_sort;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array = { 20, 8, -1, 5, 55, -22, -55, 35 };

        for (
                int lastUnsortedIndex = array.length - 1;
                lastUnsortedIndex > 0;
                lastUnsortedIndex--
        ) {

            int largestIndex = 0;

            for (
                    int index = 1;
                    index <= lastUnsortedIndex;
                    index++
            ) {
                if (array[index] > array[largestIndex]) {
                    largestIndex = index;
                }
            }

            swap(array, largestIndex, lastUnsortedIndex);

        }

        for (int number : array) {
            System.out.print(number + " ");
        }

    }

    private static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

}
