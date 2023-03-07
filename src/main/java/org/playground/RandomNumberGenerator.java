package org.playground;

import java.util.Random;
import java.util.Scanner;

/**
 * Design an algorithm to generate a 6-digit random number that works based on either the
 * binary, octal or hexadecimal system.
 */

public class RandomNumberGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Prompt user to enter number system choice or exit to quit
            System.out.print("Enter number system choice (binary, octal, hexadecimal) or exit to quit: ");
            String numberSystemChoice = scanner.nextLine().toLowerCase();

            // Check if user wants to quit
            if (numberSystemChoice.equals("exit")
                    || numberSystemChoice.equals("quit")
                    || numberSystemChoice.equals("q")) {
                System.out.println("Goodbye!");
                break;
            }

            // Generate random number in the chosen number system
            String randomNumber;
            try {
                randomNumber = generateRandomNumber(numberSystemChoice);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }

            // Output the random number to the console
            System.out.printf("Random %s number: %s\n", numberSystemChoice, randomNumber);
        }
        scanner.close();
    }

    public static String generateRandomNumber(String numberSystem) {
        Random random = new Random();
        // Define the maximum number for each number system.
        int maxNumber = switch (numberSystem) {
            case "binary" -> Integer.parseInt("111111", 2);
            case "octal" -> Integer.parseInt("777777", 8);
            case "hexadecimal" -> Integer.parseInt("FFFFFF", 16);
            default -> throw new IllegalArgumentException("Invalid number system choice.");
        };

        // Generate a random number within the range of 0 and the maximum number
        int randomNumber = random.nextInt(maxNumber + 1);

        // Convert the random number to the chosen number system
        String result;
        if (numberSystem.equals("binary")) {
            result = Integer.toBinaryString(randomNumber);
        } else if (numberSystem.equals("octal")) {
            result = Integer.toOctalString(randomNumber);
        } else {
            result = Integer.toHexString(randomNumber);
        }

        // Pad the result with leading zeros to make it a 6-digit number
        while (result.length() < 6) {
            result = "0" + result;
        }
        return result;
    }
}
