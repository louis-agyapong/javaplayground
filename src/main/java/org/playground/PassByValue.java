package org.playground;

/**
 * This program demonstrates that only a copy of an argument
 * is passed into a method.
 */

public class PassByValue {
    public static void main(String[] args) {
        int number = 99; // number starts with 99

        // Display the value in number
        System.out.println("Number is " + number);

        // Call changeMe, passing the value in number as an argument
        changeMe(number);

        // Display the value in number again.
        System.out.println("Number is " + number);
    }

    /**
     * ChangeMe method accepts an argument and then changes
     * the value of the parameter.
     */

    public static void changeMe(int myValue) {
        // change myValue parameter variable to 0.
        myValue = 0;
        // Display the value in myValue.
        System.out.println("Now the value is " + myValue);
    }
}
