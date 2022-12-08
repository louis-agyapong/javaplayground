package org.playground;

import javax.swing.*;

/**
 * This program demonstrates the FinalExam class,
 * which extends the GradedActivity class.
 */

public class FinalExamDemo {
    public static void main(String[] args) {
        String input;
        int questions;
        int missed;

        // Get the number of questions on the exam.
        input = JOptionPane.showInputDialog("How many questions are on the final exam?");
        questions = Integer.parseInt(input);

        // Get the number of questions the student missed.
        input = JOptionPane.showInputDialog("How many questions did the student miss?");
        missed = Integer.parseInt(input);

        // Create a final exam object
        FinalExams exams = new FinalExams(questions, missed);

        // Display the test results.
        JOptionPane.showMessageDialog(null, "Each question counts " +
                 exams.getPointEach() + " points.\nThe exam score is " + exams.getScore() +
                "\nThe exam grade is " + exams.getGrade());

        System.exit(0);
    }
}
