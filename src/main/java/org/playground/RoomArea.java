package org.playground;

import javax.swing.*;

/**
 * This program creates three instances of the
 * Rectangle class.
 */

public class RoomArea {
    public static void main(String[] args) {
        double number;
        double totalArea;
        String input;

        // Create three rectangle objects.
        Rectangle kitchen = new Rectangle(9.0, 4.9);
        Rectangle bedroom = new Rectangle(2.3, 5.6);
        Rectangle den = new Rectangle(9.8, 6.8);

        // Get and store the dimensions of the kitchen.
        input = JOptionPane.showInputDialog("What is the kitchen's length");
        number = Double.parseDouble(input);
        kitchen.setLength(number);
        input = JOptionPane.showInputDialog("What is the kitchen's width");
        number = Double.parseDouble(input);
        kitchen.setWidth(number);

        // Get and store the dimensions of the bedroom.
        input = JOptionPane.showInputDialog("What is the bedroom's length");
        number = Double.parseDouble(input);
        bedroom.setLength(number);
        input = JOptionPane.showInputDialog("What is the bedroom's width");
        number = Double.parseDouble(input);
        bedroom.setWidth(number);

        // Get and store the dimensions of the den.
        input = JOptionPane.showInputDialog("What is the den's length");
        number = Double.parseDouble(input);
        den.setLength(number);
        input = JOptionPane.showInputDialog("What is the den's width");
        number = Double.parseDouble(input);
        bedroom.setWidth(number);

        // Calculate the total area of the rooms.
        totalArea = bedroom.getArea() + kitchen.getArea() + den.getArea();

        // Display the total area of the rooms.
        JOptionPane.showMessageDialog(null, String.format("The total area of the " +
                "rooms is %.2f", totalArea));

        System.exit(0);
    }
}
