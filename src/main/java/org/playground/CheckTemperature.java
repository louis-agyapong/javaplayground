package org.playground;

import java.util.Scanner;

/**
 * This program assists a technician in the process
 * of checking a substance's temperature.
 */

public class CheckTemperature {
    public static void main(String[] args) {
        final double MAX_TEMP = 102.5; // Maximum temperature
        double temperature; // To hold the temperature

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get the current temperature.
        System.out.print("Enter the substance's Celsius temperature: ");
        temperature = keyboard.nextDouble();

        // As long as necessary, instruct the
        // technician to adjust the temperature
        while (temperature > MAX_TEMP) {
            System.out.println("The temperature is too high.");
            System.out.println("Turn the thermostat down and wait 5 minutes.");
            System.out.println("Then, turn the Celsius temperature again");
            temperature = keyboard.nextDouble();
        }

        // Remind the technician to check the
        // temperature again in 15 minutes.
        System.out.println("The temperature is acceptable.");
        System.out.println("Check it again in 15 minutes.");

    }
}
