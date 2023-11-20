package patterns.Visitor.pattern;

public class LowerCaseVisitor implements VisitorInterface {

    @Override
    public void convert(ElementAbstract element) {
        try {
            String value = (String) element.getValue();
            element.setValue(value.toLowerCase());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
