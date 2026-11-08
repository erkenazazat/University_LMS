package concrete_elements;

import interface_element.IAssessment;
import interface_visitor.IAssessmentVisitor;

public class Quiz implements IAssessment {
    private int questions=10;
    private int timeLimit=15;

    public int getQuestions() {
        return questions;
    }
    public void setQuestions(int questions) {
        this.questions=questions;
    }
    public int getTimeLimit() {
        return timeLimit;
    }
    public void setTimeLimit(int timeLimit) {
        this.timeLimit=timeLimit;
    }
    @Override
    public void accept(IAssessmentVisitor visitor) {
        visitor.visit(this);
    }
}
