package dev.olaore.bubble_sort;

// 1. loop through each element, setting the lastUnsortedIndex to the last index of the array
// 2. loop from the start index to the last unsorted index swapping smaller numbers for larger ones along the way
// 3. doing this, we bubble the biggest numbers to the end of the array
// 4. reduce the lastUnsortedIndex after each iteration
// 5. complete this until the lastUnsortedIndex equals 0

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = { 20, 8, -1, 5, 55, -22, -55, 35 };

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int index = 0; index < lastUnsortedIndex; index++) {
                if (array[index] > array[index + 1]) {
                    swap(array, index, index+1);
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }

    private static void swap(int[] array, int i, int j) {
        if (array[i] == array[j]) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
