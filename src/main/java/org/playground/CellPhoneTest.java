package org.playground;

import java.util.Scanner;

/**
 * This program runs a simple test
 *  of the CellPhone class.
 */

public class CellPhoneTest {
    public static void main(String[] args) {
        String testMan, testMod;
        double testPrice;

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get the manufacturer name.
        System.out.print("Enter the manufacturer: ");
        testMan = keyboard.nextLine();

        // Get the model number.
        System.out.print("Enter the model number: ");
        testMod = keyboard.nextLine();

        // Get the retail price
        System.out.print("Enter the retail price: ");
        testPrice = keyboard.nextDouble();

        // Create an instance of the cellphone class
        // passing the data that was entered as arguments to the
        // constructor.
        CellPhone phone = new CellPhone(testMan, testMod, testPrice);

        // Get the data from the phone and display it.
        System.out.println("\nHere is the data that you provided:");
        System.out.println("Manufacturer: " + phone.getManufacturer());
        System.out.println("Model Number " + phone.getModel());
        System.out.println("Retail Price " + phone.getRetailPrice());
    }
}
