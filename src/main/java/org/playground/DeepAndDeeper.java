package org.playground;

/**
 * This program demonstrates hierarchical calls.
 */

public class DeepAndDeeper {
    public static void main(String[] args) {
        System.out.println("I am starting in main()");
        deep();
        System.out.println("Now I'm back in main()");
    }

    /**
     * The deep method simply displays and calls deeper.
     */
    public static void deep() {
        System.out.println("I am now in deep.");
        deeper();
        System.out.println("Now I am back in deep.");
    }

    /**
     * The deeper method simply displays a message.
     */
    public static void deeper() {
        System.out.println("I am now in deeper.");
    }
}
