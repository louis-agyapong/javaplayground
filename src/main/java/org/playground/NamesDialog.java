package org.playground;

/*
    This program demonstrate using dialogs with JOptionPane.
 */

import javax.swing.*;

public class NamesDialog {
    public static void main(String[] args) {
        String firstName; // The user's first name
        String middleName; // The user's middle name
        String lastName; // The user's last name

        // Get the user's first name.
        firstName = JOptionPane.showInputDialog("What is your first name?");

        // Get the user's middle name
        middleName = JOptionPane.showInputDialog("What is your middle name?");

        // Get the user's last name
        lastName = JOptionPane.showInputDialog("What is your last name?");

        // Display a greeting
        JOptionPane.showMessageDialog(null, "Hello %s %s %s".formatted(firstName, middleName, lastName));
        System.exit(0);
    }
}