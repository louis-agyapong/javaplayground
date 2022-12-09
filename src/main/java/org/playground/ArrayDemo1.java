package org.playground;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * This program shows values being stored in an array's
 * elements and displayed.
 */

public class ArrayDemo1 {
    public static void main(String[] args) {
        // Number of employees
        final int EMPLOYEES = 3;
        // Array of hours
        int[] hours = new int[EMPLOYEES];
        int totalHours = 0;

        // Create a scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the hours worked by " + EMPLOYEES + " employees.");
        
        // Get the hours worked by the employees and the sum
        // of all the hours worked by the employees.

        for (int i = 0; i < EMPLOYEES; i++) {
            // Get the hours worked by employees
            System.out.print("Employee " + (i + 1) + ": ");
            hours[i] = keyboard.nextInt();
            totalHours += hours[i];
        }

        // Display the total of employee hours worked.
        System.out.println("Total Employee Hours Worked: " + totalHours);

        // Display average employees hours worked.
        double averageHours = Arrays.stream(hours).average().orElseThrow();
        System.out.println("The Average Employees Hours Worked: " + averageHours);

        // Display hours entered
        System.out.println("The hours you entered are");
        for (int element: hours) {
            System.out.println(element);
        }


    }
}
