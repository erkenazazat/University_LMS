package concrete_visitors;

import concrete_elements.Assignment;
import concrete_elements.LabWork;
import concrete_elements.Quiz;
import interface_visitor.IAssessmentVisitor;

public class PointBonusVisitor implements IAssessmentVisitor {
    @Override
    public void visit(Assignment assignment) {
        assignment.setScore(assignment.getScore()+5);
        System.out.println("New assignment score after bonus: "+assignment.getScore());
    }
    @Override
    public void visit(Quiz quiz) {
        quiz.setQuestions(quiz.getQuestions()+5);
        System.out.println("New quiz questions: "+quiz.getQuestions());
    }
    @Override
    public void visit(LabWork labWork) {
        labWork.setParts(labWork.getParts()+1);
        System.out.println("New lab parts: "+labWork.getParts());
    }
}
