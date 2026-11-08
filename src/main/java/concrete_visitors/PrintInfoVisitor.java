package concrete_visitors;

import concrete_elements.Assignment;
import concrete_elements.LabWork;
import concrete_elements.Quiz;
import interface_visitor.IAssessmentVisitor;

public class PrintInfoVisitor implements IAssessmentVisitor {
    @Override
    public void visit(Assignment assignment) {
        System.out.println("Assignment score: "+assignment.getScore()+", deadline in: "+assignment.getDeadlineDays()+" days.");
    }
    @Override
    public void visit(Quiz quiz) {
        System.out.println("Quiz questions: "+quiz.getQuestions()+", time limit: "+quiz.getTimeLimit()+"mins.");
    }
    @Override
    public void visit(LabWork labWork) {
        System.out.println("Lab work language: "+labWork.getLang()+", parts: "+labWork.getParts());
    }
}
