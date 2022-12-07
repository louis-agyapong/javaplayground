package org.playground;

/**
 * This program demonstrates the Rectangle
 * class setLength method.
 */

public class LengthWidthDemo {
    public static void main(String[] args) {
        // Create a rectangle object and assign its
        // address to the box variable.
        Rectangle box = new Rectangle(5.0, 4.0);

        // Indicate what we are doing.
        System.out.println("Setting the value of LENGTH ");

        // Call the box object's setLength method
        box.setLength(10.0);
        // Display the object's length
        System.out.println("The box's length is " + box.getLength());

        // Indicate what we are doing.
        System.out.println("Setting the value of WIDTH");
        // Call the box object's setWidth method
        box.setWidth(23.0);
        // Display the objects width
        System.out.println("The box's width is " + box.getWidth());

        // Display the objects area
        System.out.println("Area of object is " + box.getArea());

        // Indicate we are done.
        System.out.println("Done.");

    }
}
