package dev.olaore;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[7];

        numbers[0] = 22;
        numbers[1] = -21;
        numbers[2] = 911;
        numbers[3] = 56;
        numbers[4] = 12;
        numbers[5] = 23;
        numbers[6] = 101;

        for (int cnt = 0; cnt < numbers.length; cnt++) {
            System.out.println("Number " + (cnt+1) + ": " + numbers[cnt]);
        }
    }
}
