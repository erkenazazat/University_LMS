import concrete_elements.Assignment;
import concrete_elements.LabWork;
import concrete_elements.Quiz;
import concrete_visitors.PointBonusVisitor;
import concrete_visitors.PrintInfoVisitor;
import interface_element.IAssessment;
import interface_visitor.IAssessmentVisitor;

public class Main {
    public static void main(String[] args) {
        IAssessment assignment=new Assignment();
        IAssessment quiz=new Quiz();
        IAssessment labWork=new LabWork();

        IAssessment[] assessments={assignment, quiz, labWork};

        IAssessmentVisitor printVisitor=new PrintInfoVisitor();
        for (IAssessment assessment : assessments) {
            assessment.accept(printVisitor);
        }

        IAssessmentVisitor bonusVisitor=new PointBonusVisitor();
        for (IAssessment assessment : assessments) {
            assessment.accept(bonusVisitor);
        }
    }
}