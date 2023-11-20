package patterns.Visitor.pattern;

public class StringElement extends ElementAbstract {
    
    @Override
    public boolean validade(Object value) {
        return value instanceof String;
    }

}
