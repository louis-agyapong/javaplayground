package org.playground;

import java.util.Scanner;

/**
 * This program displays a rectangular pattern of
 * asterisks.
 */

public class ReactangularPattern {
    public static void main(String[] args) {
        int rows, cols;

        // Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Get the number of rows
        System.out.print("How many rows? ");
        rows = keyboard.nextInt();
        // Get the number of columns
        System.out.print("How many columns? ");
        cols = keyboard.nextInt();

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
