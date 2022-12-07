package org.playground;

/**
 * This program demonstrates a method with a parameter.
*/
public class ParseArg {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("I am passing values to displayValue.");
        displayValue(5);
        displayValue(x);
        displayValue(x * 10);
        displayValue(Integer.parseInt("7000"));

        System.out.println("Now I am back in main.");
    }

    /*
     * The displayValue method displays the value
     * of its integer parameter.
     */

    public static void displayValue(int num) {
        System.out.println("The value is " + num);
    }

}
