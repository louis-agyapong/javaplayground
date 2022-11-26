package org.playground;

/**
 * This program demonstrates that string arguments
 * cannot be changed.
 */

public class PassString {
    public static void main(String[] args) {
        // Create a string object containing "Shakespeare"
        // the name variable references the object.
        String name = "Shakespeare";

        // Display the String referenced by the name variable.
        System.out.println("In main the name is " + name);

        // Call the changeName method, passing the contents
        // of the same variable as an argument.
        changeName(name);

        // Display the string referenced by the variable.
        System.out.println("Back in main the name is " + name);

    }

    /**
     * The changeName method accepts a String as its argument
     * @param name assigns the name parameter to a String
     */
    public static void changeName(String name) {
        // Create s String object containing "Dickens".
        // Assign its address to the name parameter variable.
        name = "Dickens";

        // Display the String referenced by name.
        System.out.println("In changeName, the name is now " +
                name);
    }
}
