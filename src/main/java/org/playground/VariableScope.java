package org.playground;

import javax.swing.*;

/**
 * This program demonstrates how variable
 * may be declared in various locations
 * throughout a program.
 */

public class VariableScope {
    public static void main(String[] args) {

        // Get the user's first name.
        String firstName;
        firstName = JOptionPane.showInputDialog("Enter your first name.");
        // Get the user's last name.
        String lastName;
        lastName = JOptionPane.showInputDialog("Enter your last name");

        JOptionPane.showMessageDialog(null, "Hello "
                + firstName + " " + lastName + ".");
        System.exit(0);
    }
}
