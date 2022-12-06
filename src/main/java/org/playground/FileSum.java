package org.playground;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * This program reads a series of numbers from a file
 * and accumulates their sum.
 */

public class FileSum {
    public static void main(String[] args) throws IOException {
        double sum = 0.0; // Accumulator, initialized to 0

        // Open the file for reading.
        File file = new File("numbers.txt");
        Scanner inputFiile = new Scanner(file);

        // Read all the values from the file and calculate
        // their total.
        while (inputFiile.hasNext()) {
            // Read a value from the file.
            double number = inputFiile.nextDouble();
            // Add the number to sum.
            sum += number;
        }
        // close the file.
        inputFiile.close();

        // Display the sum of the numbers.
        System.out.printf("The sum of the numbers in " +
                "numbers.txt is %.2f", sum);

    }
}
