package org.playground;

import java.util.Scanner;

/**
 * This program demonstrates a switch statement.
 */

public class PetFood {
    public static void main(String[] args) {
        String input; // To hold the user's input
        char foodGrade; // Grade of pet food

        // Create a scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user for a grade of pet food
        System.out.println("Our pet food is available in three grades: ");
        System.out.print("A, B, and C: Which do you want pricing for? ");

        input = keyboard.nextLine();
        foodGrade = input.charAt(0);

        switch (foodGrade) {
            case 'a', 'A' -> System.out.println("30 cents per lb.");
            case 'b', 'B' -> System.out.println("20 cents per lb.");
            case 'c', 'C' -> System.out.println("15 cents per lb.");
            default -> System.out.println("Invalid choice.");
        }
    }
}
