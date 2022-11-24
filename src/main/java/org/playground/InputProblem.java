package org.playground;

import java.util.Scanner;

/**
 * This program has a problem reading input.
 */

public class InputProblem {
    public static void main(String[] args) {
        String name; // to hold the user's name
        int age; // to hold the user's age
        double income; // to hold the user's income

        // Create a scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the user's input.
        System.out.print("What is your age? ");
        age = keyboard.nextInt();

        // Get the user's income.
        System.out.print("What is your annual income? ");
        income = keyboard.nextDouble();

        // Consume the remaining new line
        keyboard.nextLine();

        // Get the user's name.
        System.out.print("What is your name? ");
        name = keyboard.nextLine();

        // Display the information back to the user.
        System.out.println("Hello " + name + ". Your age is " + age + " and your income $" + income);

    }
}
