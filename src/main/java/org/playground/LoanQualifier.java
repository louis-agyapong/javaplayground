package org.playground;

import javax.swing.*;

/**
 * This program demonstrates nested if statement.
 */

public class LoanQualifier {
    public static void main(String[] args) {
        double salary; // Annual salary
        double yearsOnJob; // years at current job
        String input; // To hold string input

        // Get the user's annual salary.
        input = JOptionPane.showInputDialog("Enter your annual salary.");
        salary = Double.parseDouble(input);

        // Get the number of years at the current job.
        input = JOptionPane.showInputDialog("Enter the number of years at your current job.");
        yearsOnJob = Double.parseDouble(input);

        // Determine whether the user qualifies for the loan.
        if (salary >= 30000) {
            if (yearsOnJob >= 2) {
                JOptionPane.showMessageDialog(null, "You qualify for the loan.");
            } else {
                JOptionPane.showMessageDialog(null, "You must have been on your current job" +
                        " for at least 2 years to qualify.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "You must earn atleast $30000 per year to " +
                    "qualify.");
        }
        System.exit(0);
    }
}
