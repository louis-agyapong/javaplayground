package org.playground;

/**
 * The bank account class simulates a bank account.
 */

public class BankAccount {
    // Account balance.
    private double balance;

    /**
     * This constructor sets the starting balance
     * at 0.0.
     */
    public BankAccount() {
        this.balance = 0.0;
    }

    public BankAccount(double startingBalance) {
        this.balance = startingBalance;
    }

    public BankAccount(String str) {
        this.balance = Double.parseDouble(str);
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void deposit(String str) {
        this.balance += Double.parseDouble(str);
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void withdraw(String str) {
        this.balance -= Double.parseDouble(str);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setBalance(String str) {
        balance = Double.parseDouble(str);
    }

    public double getBalance() {
        return balance;
    }
}
