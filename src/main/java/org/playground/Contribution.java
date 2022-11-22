package org.playground;

/**
 * This program calculates the amount of pay
 * that will be contributed to a retirement plan
 * if 5%, 8% or 10% of monthly pay is withheld
 */

public class Contribution {
    public static void main(String[] args) {
        // Variables to hold the monthly pay
        // and the amount of contribution.
        double monthlyPay = 6000.0;
        double contribution;

        // Calculate and display a 5% contribution.
        contribution = monthlyPay * 0.05;
        System.out.println("5 percent is $" + contribution + "per month.");

        // Calculate and display an 8% contribution.
    }
}
