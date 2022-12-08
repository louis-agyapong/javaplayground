package org.playground;

import java.util.Random;

/**
 * Die class simulates a six-sided die.
 */

public class Die {
    private int sides; // Number of sides.
    private int value; // The die's value.

    /**
     * The constructor performs an initial roll of the
     * die
     * @param numSides The number of sides for this die.
     */

    public Die(int numSides) {
        sides = numSides;
        roll();
    }

    /**
     * The roll method simulates rolling of the die
     */
    public void roll() {
        // Create a random object.
        Random rand = new Random();

        // Get a random value for the die.
        value = rand.nextInt(sides) + 1;
    }

    public int getSides() {
        return sides;
    }

    public int getValue() {
        return value;
    }
}
