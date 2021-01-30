package dev.olaore.selection_sort;

public class SelectionSortReview {

    public static void main(String[] args) {

        int[] array = { 10, -7, 20, -3, 0, 15, 33, -2, -1, 21 };

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largestIndex = 0;

            for (int index = 0; index <= lastUnsortedIndex; index++) {
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
