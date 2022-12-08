package org.playground;

import javax.swing.*;

/**
 * This class demonstrates the grade activity class
 */

public class GradeDemo {
    public static void main(String[] args) {
        // To hold input
        String input;
        // A test score
        double testScore;

        // Create a gradeActivity object.
        GradeActivity grade = new GradeActivity();

        // Get a test score.
        input = JOptionPane.showInputDialog("Enter a numeric test score.");
        testScore = Double.parseDouble(input);

        // Store test score in the grade object.
        grade.setScore(testScore);

        // Display the letter grade for the score.
        JOptionPane.showMessageDialog(null, String.format("The grade for that test is %c", grade.getGrade()));

        System.exit(0);
    }
}
