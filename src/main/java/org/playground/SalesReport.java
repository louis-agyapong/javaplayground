package org.playground;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *This program opens a file containing the sales
 * amounts for 30 days. It calculates and displays
 * the total sales and average daily sales.
 */

public class SalesReport {
    public static void main(String[] args) throws IOException {
        // Number of days of sales
        final int NUM_OF_DAYS = 30;
        // The name of the file to open
        String filename;
        // Total sales for period
        double totalSales;
        // Average daily sales
        double averageSales;

        // Get the name of the file.
        filename = getFileName();

        // Get the total sales from the file.
        totalSales = getTotalSales(filename);

        // Calculate the average
        averageSales = totalSales / NUM_OF_DAYS;

        // Display the total and average.
        displayResult(totalSales, averageSales);

        System.exit(0);
    }

    public static String getFileName() {
        return JOptionPane.showInputDialog("Enter the name of the file" +
                "\ncontaining 30 days of sales amounts.");
    }

    public static double getTotalSales(String filename) throws IOException {
        // Accumulator
        double total = 0.0;
        // A daily sales amount
        double sales;

        // Open the file
        File file = new File(filename);

        Scanner inputFile = new Scanner(file);

        // This loop processes the lines read from the file,
        // until the end of the file is encountered.
        while(inputFile.hasNext()) {
            // Read a double from the file.
            sales = inputFile.nextDouble();
            // Add sales to the value already in total.
            total += sales;
        }
        // Close the file.
        inputFile.close();
        // Return the total sales.
        return total;
    }

    public static void displayResult(double total, double avg) {
        // Display the formatted total and average sales.
        JOptionPane.showMessageDialog(null, String.format("The total sales for the period is $%,.2f\n" +
                "The average daily sales were $%,.2f", total, avg));
    }

}
