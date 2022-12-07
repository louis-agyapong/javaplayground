package org.playground;

import javax.swing.*;

/**
 * This program demonstrates the bank account class.
 */

public class AccountTest {
    public static void main(String[] args) {
        // To hold user input
        String input;

        // Get the starting balance
        input = JOptionPane.showInputDialog("What is your account's starting balance?");

        // Create a bank account object
        BankAccount account = new BankAccount(input);

        // Get the amount of pay.
        input = JOptionPane.showInputDialog("How much were you paid this month?");

        // Deposit the user's pay into the bank account.
        account.deposit(input);

        // Display the new balance
        JOptionPane.showMessageDialog(null
        , String.format("Your pay has been deposited.\nYour current balance is $%,.2f", account.getBalance()));

        input = JOptionPane.showInputDialog("How much would you like to withdraw?");
        account.withdraw(input);

        JOptionPane.showMessageDialog(null, String.format("Now your balance is $%,.2f", account.getBalance()));

        System.exit(0);
    }
}
