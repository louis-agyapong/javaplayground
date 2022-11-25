package org.playground;

public class ParseArg {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("I am passing values to displayValue()");

        displayValue(5); // pass 5
        displayValue(x * 4); // pass 10
        displayValue(Integer.parseInt("700")); // pass 700
        System.out.println("Now I am back in main.");
    }

    /*
        The displayValue method displays the value
        of its integer parameter.
     */
    public static void displayValue(int num) {
        System.out.println("The value is " + num);
    }
}
