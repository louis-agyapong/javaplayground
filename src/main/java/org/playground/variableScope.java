package org.playground;

import javax.swing.*;

/**
 * This program demonstrates how variables may be declared in various locations
 * throughout a program.
 */

public class variableScope {
    public static void main(String[] args) {
        String firstName;
        String lastName;

        // Get the user's first name
        firstName = JOptionPane.showInputDialog("Enter your first name.");

        // Get the user's last name
        lastName = JOptionPane.showInputDialog("Enter your last name.");

        JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + lastName);
        System.exit(0);
    }
}
