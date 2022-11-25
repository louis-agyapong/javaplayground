package org.playground;

import javax.swing.*;

public class AverageScore {
    public static void main(String[] args) {
        double score1, score2, score3, average;
        String input;
        boolean highScore = false;
        String highScoreMessage = "That's a high score.";

        // Get the first test score.
        input = JOptionPane.showInputDialog("Enter score #1: ");
        score1 = Double.parseDouble(input);

        // Get the second score.
        input = JOptionPane.showInputDialog(input);
        score2 = Double.parseDouble(input);

        // Get the third score.
        input = JOptionPane.showInputDialog(input);
        score3 = Double.parseDouble(input);

        // Calculate the average score.
        average = (score1 + score2 + score3) / 3.0;

        // If the score is greater than 95, let
        // the user know that's a great score.
        if (average > 95) {
            highScore = true;
            JOptionPane.showMessageDialog(null, highScoreMessage);
        }
        else
            JOptionPane.showMessageDialog(null, "Your average score is "
            + average);

        if (highScore)
            System.out.println(highScoreMessage);

        System.exit(0);
    }
}
