package concrete_elements;

import interface_element.IAssessment;
import interface_visitor.IAssessmentVisitor;

public class Assignment implements IAssessment {
    private int score=90;
    private int deadlineDays=3;

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score=score;
    }
    public int getDeadlineDays() {
        return deadlineDays;
    }
    public void setDeadlineDays(int deadlineDays) {
        this.deadlineDays=deadlineDays;
    }
    @Override
    public void accept(IAssessmentVisitor visitor) {
        visitor.visit(this);
    }
}
