package patterns.Visitor.pattern;

public abstract class ElementAbstract {
    
    protected Object value;

    public abstract boolean validade(Object value);

    public void setValue(Object value) throws Exception {
        if (!validade(value)) {
            throw new Exception("Invalid value");
        }
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void accept(VisitorInterface visitor) {
        visitor.convert(this);
    }

}
