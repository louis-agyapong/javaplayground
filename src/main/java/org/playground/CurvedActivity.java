package org.playground;

/**
 * This class computes a curved grade. It extends
 * the GradedActivity class.
 */

public class CurvedActivity extends  GradeActivity {
    double rawScore; // Unadjusted score
    double percentage; // Curve percentage

    /**
     * The ctor sets the curved percentage.
     */

    public CurvedActivity(double percentage) {
        this.percentage = percentage;
        rawScore = 0.0;
    }

    @Override
    public void setScore(double score) {
        rawScore = score;
        super.setScore(rawScore * percentage);
    }

    public double getRawScore() {
        return rawScore;
    }

    public double getPercentage() {
        return percentage;
    }
}
