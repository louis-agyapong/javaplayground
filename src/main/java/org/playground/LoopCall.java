package org.playground;

public class LoopCall {
    public static void main(String[] args) {
        System.out.println("Hello from main()");
        for (int i = 0; i < 5; i++)
            displayMethod();
        System.out.println("Back to main()");
    }

    public static void displayMethod() {
        System.out.println("Hello from displayMethod()");
    }
}
