package org.playground;

public class PassByValue {
    public static void main(String[] args) {
        int number = 99;
        // Display the value in a number
        System.out.println("Number is " + number);
        // Call changeMe, passing the value in number
        // as an argument.
        changeMe(number);
        // Display the value in number again
        System.out.println("Number is " + number);
    }

    /*
        The changeMe method accepts an argument and
        then changes the value of the parameter.
     */
    public static void changeMe(int myValue) {
        System.out.println("I am changing the value");

        // change myValue to 0
        myValue = 0;

        // Display myValue
        System.out.println("Now the value is " + myValue);
    }
}
