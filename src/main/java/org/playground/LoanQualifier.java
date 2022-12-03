package org.playground;

import javax.swing.*;

public class LoanQualifier {
    public static void main(String[] args) {
        double salary, yearOnJob;
        String input;

        // Get user's annual salary
        input = JOptionPane.showInputDialog("Enter your annual salary.");
        salary = Double.parseDouble(input);

        // Get the number of years at the current job.
        input = JOptionPane.showInputDialog("Enter the number of years at your current job.");
        yearOnJob = Double.parseDouble(input);

        // Determine whether the user qualifies for loan
        if (salary >= 30000) {
            if (yearOnJob >= 2) {
                JOptionPane.showMessageDialog(null, "You qualify for the loan");
            } else {
                JOptionPane.showMessageDialog(null, "You must have been on your current" +
                        " job for at least two years to qualify.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "You must earn at least $30, 000 " +
                    "per year to qualify");
        }
        System.exit(0);
    }
}
