package org.playground;

import javax.swing.*;

/**
 * This program demonstrate the if statement.
 */

public class AverageScore {
    public static void main(String[] args) {
        double score1, score2, score3, average;
        String input; // to hold user's input

        // Get the first test score.
        input = JOptionPane.showInputDialog("Enter score 1");
        score1 = Double.parseDouble(input);

        // Get the second test score.
        input = JOptionPane.showInputDialog("Enter score 2");
        score2 = Double.parseDouble(input);

        // Get the third test score.
        input = JOptionPane.showInputDialog("Enter score 3");
        score3 = Double.parseDouble(input);

        // Calculate the average score.
        average = (score1 + score2 + score3) / 3.0;

        // Display the average score
        JOptionPane.showMessageDialog(null, "The average score is " +
                average);

        // If average score is greater than 95, let the user know
        // that's a great score.
        if (average > 95)
            JOptionPane.showMessageDialog(null, "That's a great score.");

        System.exit(0);

    }
}
