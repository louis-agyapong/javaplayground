package org.playground;

/**
 * This program demonstrates a method that
 * returns a reference to a String object.
 */

public class ReturnString {
    public static void main(String[] args) {
        String customerName;

        customerName = fullName("Afia Sika", "Agyapong");
        System.out.println(customerName);
    }

    public static String fullName(String firstName, String lastName) {
        return String.format("%s %s", firstName, lastName);
    }
}
