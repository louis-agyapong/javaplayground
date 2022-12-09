package org.playground;

import java.util.Scanner;

/**
 * This program stores in an array the hours worked by five
 * employees who all make the same hours wage.
 */

public class PayArray {
    public static void main(String[] args) {
        // Number of employees
        final int EMPLOYEES = 5;
        // Hourly pay rate
        double payRate;
        // Gross pay
        double grossPay;

        // Create an array to hold employee hours.
        int[] hours = new int[EMPLOYEES];
        // Create a scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get hours worked by each employee.
        System.out.println("Enter the hours worked by " + EMPLOYEES
            + " employees who all earn the same hourly rate.");

        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.print("Employee # " + (i + 1) + ": ");
            hours[i] = keyboard.nextInt();
        }

        // Get the hourly pay rate
        System.out.println("Enter the hourly rate for each employee: ");
        payRate = keyboard.nextDouble();

        // Display each employee's gross pay.
        System.out.println("Here's each employee's gross pay:");
        for (int i = 0; i < EMPLOYEES; i++) {
            grossPay = hours[i] * payRate;
            System.out.println("Employee #" + (i + 1) + ": $" + grossPay);
        }
    }
}
