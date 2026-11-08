package concrete_elements;

import interface_element.IAssessment;
import interface_visitor.IAssessmentVisitor;

public class LabWork implements IAssessment {
    private String lang = "Java";
    private int parts=3;

    public String getLang() {
        return lang;
    }
    public void setLang(String lang) {
        this.lang=lang;
    }
    public int getParts() {
        return parts;
    }
    public void setParts(int parts) {
        this.parts=parts;
    }
    @Override
    public void accept(IAssessmentVisitor visitor) {
        visitor.visit(this);
    }
}
