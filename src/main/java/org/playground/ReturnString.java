package org.playground;


/**
 * This program demonstrates a method that
 * returns a reference to a string object.
 */
public class ReturnString {
    public static void main(String[] args) {
        String customerName;

        customerName = fullName("Sika", "Agyapong");
        System.out.println(customerName);
    }

    public static String fullName(String first, String last) {
        String name;
        name = first + " " + last;
        return name;
    }

}
