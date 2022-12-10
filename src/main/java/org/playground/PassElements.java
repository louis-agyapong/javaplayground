package org.playground;

/**
 * This program demonstrates passing individual array elements
 *  as arguments to a method.
 */

public class PassElements {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25, 30, 35, 40};

        for (int number : numbers) {
            showValue(number);
        }
    }

    public static void showValue(int n) {
        System.out.print(n + " ");
    }
}
