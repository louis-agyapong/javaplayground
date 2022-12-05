package org.playground;

/**
 * Using nested loops to print patterns.
 */

public class Patterns {
    public static void main(String[] args) {
        final int COLS = 6;
        final int ROWS = 8;
        for (int row = 0; row < ROWS; row++){
            for (int col = 0; col < COLS; col++)
                System.out.print("*");
            System.out.println();
        }
    }
}
