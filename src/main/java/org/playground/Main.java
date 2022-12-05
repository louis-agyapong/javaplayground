package org.playground;

public class Main {
    public static void main(String[] args) {
        double value1 = 123.45678, value2 = 123.45678, value3 = 123.45678;
        System.out.printf("%.1f %.2f %.4f", value1, value2, value3);

        double amount = 300007890.98787;
        System.out.printf("\n%,.3f", amount);

        int number = 1234;
        System.out.printf("\nThe number is:%07d", number);

    }

    public static void addMoneyToAccount(String accountHolder, int moneyToAdd) {
        System.out.println("Account holder: " + accountHolder + " Amount transferred: " + moneyToAdd);
    }

}
