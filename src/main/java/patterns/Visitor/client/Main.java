package patterns.Visitor.client;

import patterns.Visitor.pattern.ElementAbstract;
import patterns.Visitor.pattern.LowerCaseVisitor;
import patterns.Visitor.pattern.StringElement;
import patterns.Visitor.pattern.UpperCaseVisitor;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        ElementAbstract element = new StringElement();
        element.setValue("Teste string");
        element.accept(new UpperCaseVisitor());
        System.out.println(element.getValue());

        element.accept(new LowerCaseVisitor());
        System.out.println(element.getValue());

    }

}
