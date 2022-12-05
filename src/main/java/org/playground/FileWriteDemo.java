package org.playground;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This program writes data to a file.
 */

public class FileWriteDemo {
    public static void main(String[] args) throws IOException {
        String filename; // File name
        String friendName; // Friend name
        int numFriends; // Number of friends

        // Create a scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get the number of friends.
        System.out.print("How many friends do you have? ");
        numFriends = keyboard.nextInt();

        // Consume the remaining newline character.
        keyboard.nextLine();

        // Get the filename.
        System.out.print("Enter the filename: ");
        filename = keyboard.nextLine();

        // Open the file.
        PrintWriter outputFile = new PrintWriter(filename);

        // Get the data and write to it.
        for (int i = 1; i <= numFriends; i++) {
            // Get the name of a friend
            System.out.print("Enter the name of friend number " + i + ": ");
            friendName = keyboard.nextLine();

            // Write the name to the file.
            outputFile.println(friendName);
        }
        // Close the file.
        outputFile.close();
        System.out.println("Data written to file.");
    }
}
