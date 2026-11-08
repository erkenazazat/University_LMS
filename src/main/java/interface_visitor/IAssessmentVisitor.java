package interface_visitor;

import concrete_elements.Assignment;
import concrete_elements.LabWork;
import concrete_elements.Quiz;

public interface IAssessmentVisitor {
    void visit(Assignment assignment);
    void visit(Quiz quiz);
    void visit(LabWork labWork);
}
