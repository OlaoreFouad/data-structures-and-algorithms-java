package dev.olaore.utils;

public class Utils {

    public static int[] numbers = { 22, -1, -3, 10, -40, 35, 2, 55 };

    public static <T> void print(T[] array) {
        for (T element: array) {
            System.out.print(element + " ");
        }
    }

}
