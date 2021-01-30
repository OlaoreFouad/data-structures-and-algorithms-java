package dev.olaore.selection_sort;

public class SelectionSortDescending {

    public static void main(String[] args) {

        int[] array = { -2, 20, -1, 22, 3, 40, -10, 1, 18, 2 };

        for (int lastUnsortedIndex = 0; lastUnsortedIndex < array.length - 1; lastUnsortedIndex++) {

            int largestIndex = array.length - 1;
            for (int index = array.length - 1; index >= lastUnsortedIndex; index--) {
                if (array[index] > array[largestIndex]) {
                    largestIndex = index;
                }
            }

            swap(array, largestIndex, lastUnsortedIndex);

        }

        for (int number: array) {
            System.out.println( number + " ");
        }

    }

    private static void swap(int[] array, int index, int lastUnsortedIndex) {
        if (index == lastUnsortedIndex) {
            return;
        }

        int temp = array[index];
        array[index] = array[lastUnsortedIndex];
        array[lastUnsortedIndex] = temp;

    }

}
