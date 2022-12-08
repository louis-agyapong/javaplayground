package org.playground;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * This program shows an array being processed with loops.
 */

public class ArrayDemo2 {
    public static void main(String[] args) {
        final int EMPLOYEES = 3;
        int[] hours = new int[EMPLOYEES];

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the hours worked " +
                EMPLOYEES + " employees.");

        // Get the hours for each employee.
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.print("Employee" + (i + 1) + ": ");
            hours[i] = keyboard.nextInt();
        }
        System.out.println("The hours your entered are:");

        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println(hours[i]);
        }
    }
}
