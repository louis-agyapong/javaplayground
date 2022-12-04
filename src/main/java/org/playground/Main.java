package org.playground;

public class Main {
    public static void main(String[] args) {
        String name1 = "Zion", name2 = "Zion";
        String anotherName = new String("Zion");

        addMoneyToAccount(name1, 5000);
    }

    public static void addMoneyToAccount(String accountHolder, int moneyToAdd) {
        System.out.println("Account holder: " + accountHolder + " Amount transferred: " + moneyToAdd);
    }

}
