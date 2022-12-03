package org.playground;

public class Recursion {
    public static void main(String[] args) {
        countBackwards(15);
    }

    public static void countBackwards(int n) {
        if (n == 0) {
            System.out.println("Done!");
        } else {
            System.out.println(n);
            n--;
            countBackwards(n);
        }
    }
}
