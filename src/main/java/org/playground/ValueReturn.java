package org.playground;

/**
 * This program demonstrates a value returning method.
 */

public class ValueReturn {
    public static void main(String[] args) {
        int total, value1 = 20, value2 = 40;

        // Call the sum method, passing the contents of
        // value1 and value2 as arguments. Assign the
        // return value to the total variable.
        total = sum(value1, value2);

        // Display the content of all these variables.
        System.out.println("The sum of value1 and value2 is " + total);
    }

    /**
     * The sum method returns the value of its two parameters.
     * @param num1 The first number to be added.
     * @param num2 The second number to be added.
     * @return The sum of num1 and num2.
     */
    public static int sum(int num1, int num2) {
        // Return the value of num1 and num2 to it.
        return num1 + num2;
    }
}
