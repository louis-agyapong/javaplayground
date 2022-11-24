package org.playground;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input;
        char answer;

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        // Ask the user a question.
        System.out.print("Are you having fun? (Y=yes, N=no) ");
        input = keyboard.nextLine(); // Get a line of input.
        answer = input.charAt(0); // Get the first character.
        System.out.println(answer);
    }
}