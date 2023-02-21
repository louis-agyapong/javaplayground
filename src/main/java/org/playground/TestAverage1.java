package org.playground;

import java.util.Scanner;

/**
 * Do While:
 * This program demonstrates a user controlled loop
 */

public class TestAverage1 {
    public static void main(String[] args) {
        int score1, score2, score3; // Three test scores
        double average; // Average test score
        char repeat;    // To hold 'y' or 'n'
        String input;   // To hold input

        System.out.println("This program calculates the average of three test scores.");

        // Create a scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get as many sets of test scores as the user wants.
        do {
            // Get the first test score
            System.out.print("Enter score #1: ");
            score1 = keyboard.nextInt();

            // Get the second test score
            System.out.print("Enter score #2: ");
            score2 = keyboard.nextInt();

            // Get the third test score
            System.out.print("Enter score #3: ");
            score3 = keyboard.nextInt();

            // Consume the remaining new line
            keyboard.nextLine();

            // Calculate and print the average test score
            average = (score1 + score2 + score3) / 3.0;
            System.out.println("The average is " + average);
            // Print a blank line
            System.out.println();

            // Does the user want to average another set
            System.out.println("Would you like to average another set of test scores?");
            System.out.println("Enter Y for yes or N for no: ");
            // Read a line
            input = keyboard.nextLine();
            // Get the first char
            repeat = input.charAt(0);
        } while (repeat == 'Y' || repeat == 'y');
    }
}
