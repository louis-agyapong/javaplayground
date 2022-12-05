package org.playground;

/**
 * This program displays a table of speeds in
 * kph converted to mph.
 */
public class SpeedConverter {
    public static void main(String[] args) {
        // Constants
        final int STARTING_KPH = 60; // Starting speed.
        final int MAX_KPH = 130; // Max speed.
        final int INCREMENT = 10; // Speed increment.

        // Variables
        int kph; // To hold speed in kph
        double mph; // To hold speed in mph

        // Display the table headings
        System.out.println("KPH\t\tMPH");
        System.out.println("-------------------");

        // Display the speeds
        for (kph = STARTING_KPH; kph <= MAX_KPH; kph += INCREMENT) {
            mph = kph * 0.6214;

            // Display the speeds in kph and mph.
            System.out.printf("%d\t\t%.1f\n", kph, mph);
        }
    }
}
