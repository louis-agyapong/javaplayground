package org.playground;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * This program reads the first line from a file.
 */

public class ReadFile {
    public static void main(String[] args) throws IOException {
        // Create a scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        // Get the file name.
        System.out.print("Enter the name of a file: ");
        String filename = keyboard.nextLine();

        // Open the file.
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        // Read the first line from the file
        String line = inputFile.nextLine();

        System.out.print("The first line in the file is:");
        System.out.println(line);

        // Close the file.
        inputFile.close();
    }
}
