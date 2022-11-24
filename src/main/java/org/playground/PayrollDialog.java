package org.playground;

import javax.swing.*;

public class PayrollDialog {
    public static void main(String[] args) {
        String inputString, name;
        int hours;
        double payRate, grossPay;

        // Get the user's name
        name = JOptionPane.showInputDialog("What is your name? ");
        // Get the hours worked.
        inputString = JOptionPane.showInputDialog("How many hours did you work" +
                " you work this week? ");
        // Convert the input to an int.
        hours = Integer.parseInt(inputString);
        // Get the hourly pay rate.
        inputString = JOptionPane.showInputDialog("What is your hourly pay rate? ");
        // Convert the input to a double.
        payRate = Double.parseDouble(inputString);
        // Calculate the gross pay.
        grossPay = hours * payRate;

        // Display the results.
        JOptionPane.showMessageDialog(null, "Hello "
                + name + " your gross pay is " + grossPay);

        // End the program.
        System.exit(0);
    }
}
