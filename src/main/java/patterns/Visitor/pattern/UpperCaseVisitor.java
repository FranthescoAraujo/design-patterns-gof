package patterns.Visitor.pattern;

public class UpperCaseVisitor implements VisitorInterface {

    @Override
    public void convert(ElementAbstract element) {
        try {
            String value = (String) element.getValue();
            element.setValue(value.toUpperCase());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
