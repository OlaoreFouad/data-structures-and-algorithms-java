package dev.olaore.concepts;

public class Recursion {

    public static void main(String[] args) {
        System.out.println("Iterative Approach: " + iterativeFactorial(5));
        System.out.println("Recursive Approach: " + recursiveFactorial(5));
    }

    private static int recursiveFactorial(int number) {
        if (number == 0) {
            return 1;
        }

        return number * recursiveFactorial(number - 1);
    }

    private static int iterativeFactorial(int number) {

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;

    }

}
