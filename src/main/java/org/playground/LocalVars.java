package org.playground;

/**
 * This program demonstrates that two methods may have
 * local variables with the same name.
 */
public class LocalVars {
    public static void main(String[] args) {
        texas();
        california();
    }
    /**
     * The texas method has a local variable
     * named birds
     */

    public static void texas() {
        int birds = 5000;
        System.out.println("In Texas there are " + birds + " birds.");
    }

    /**
     * The california method has a local variable
     * named birds
     */

    public static void california() {
        int birds = 10000;
        System.out.println("In California there are " + birds + " birds.");
    }
}
