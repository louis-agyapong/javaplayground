package org.playground;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * This version of the program confirms that the
 * Numbers.txt file exists before opening it.
 */

public class FileSum2 {
    public static void main(String[] args) throws IOException {
        double sum = 0.0; // Accumulator initialized to 0

        // Make sure the file exists.
        File file = new File("numbers.txt");
        if (!file.exists()) {
            System.out.println("The file numbers.txt is not found.");
            System.exit(0);
        }
        // Open the file for reading.
        Scanner inputFile = new Scanner(file);

        // Read all the values from the file
        // and calculate their total.
        while (inputFile.hasNext()) {
            double number = inputFile.nextDouble();
            // Add the number to the sum.
            sum += number;
        }
        // Close the file
        inputFile.close();
        // Display the sum of the numbers.
        System.out.printf("The sum of the numbers in " +
                "numbers.txt is %.2f", sum);
    }
}
