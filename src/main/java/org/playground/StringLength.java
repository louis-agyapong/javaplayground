package org.playground;

public class StringLength {
    public static void main(String[] args) {
        String name = "Louis";
        int stringSize;

        stringSize = name.length();
        System.out.println(name + " has " + stringSize + " characters." );

        char letter;
        letter = name.charAt(3);
        System.out.println(letter);

        String bigName = "LOUIS";
        String littleName = bigName.toLowerCase();
        System.out.println(littleName);

    }
}
