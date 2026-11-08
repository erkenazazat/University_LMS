package interface_element;

import interface_visitor.IAssessmentVisitor;

public interface IAssessment {
    void accept(IAssessmentVisitor visitor);
}
