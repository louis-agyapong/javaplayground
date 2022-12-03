package org.playground;

/**
 * This program defines and calls a simple method.
 */
public class SimpleMethod {
    public static void main(String[] args) {
        System.out.println("Hello from main()");
        displayMessage();
        System.out.println("Back in main()");
    }

    public static void displayMessage() {
        System.out.println("Hello from displayMessage()");
    }
}
