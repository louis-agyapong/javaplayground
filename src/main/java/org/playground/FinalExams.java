package org.playground;

/**
 * This class determines the grade for a final exam.
 */

public class FinalExams extends GradeActivity {
    private int numQuestions; // Number of questions
    private double pointEach; // Points for each question
    private int numMissed; // Questions missed

    public FinalExams(int questions, int missed) {
        double numericScore; // To hold a numeric score
        this.numQuestions = questions;
        this.numMissed = missed;

        // Calculate the points for each question
        // and the numeric score for this exam.
        pointEach = 100.0 / questions;
        numericScore = 100.0 - (missed * pointEach);

        // call the inherited setScore method
        setScore(numericScore);
    }

    public double getPointEach() {
        return pointEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
}
