package org.playground;

import java.util.Scanner;

/**
 * This program demonstrates how the user
 * may specify an array's size.
 */

public class DisplayTestScores {
    public static void main(String[] args) {
        int numTest; // Number of tests
        int[] tests; // Array of test scores

        // Create a scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Get the number of test scores.
        System.out.print("How many tests do you have? ");
        numTest = keyboard.nextInt();

        // Create an array to hold the number of test scores.
        tests = new int[numTest];

        // Get the individual test scores
        for (int i = 0; i < tests.length; i++) {
            System.out.print("Enter test score " + (i + 1) + " : ");
            tests[i] = keyboard.nextInt();
        }

        // Display the test scores
        System.out.println();
        System.out.println("Here are the scores you entered: ");
        for (int test : tests) {
            System.out.print(test + " ");
        }
    }
}
