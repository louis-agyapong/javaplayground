package org.playground;

import java.util.Scanner;

/**
 * Conditional operator
 */

public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int score;

        System.out.print("Please enter your score: ");
        score = keyboard.nextInt();

        System.out.println("Your grade is " + score + ": " + ((score < 60) ? "Fail" : "Pass"));
    }
}
