package patterns.TemplateMethod.pattern;

public abstract class OrderAbstract {
    
    public Double finalValue(Double value, int size, Double changeValue) {
        value += freight(size);
        value += changeValue(changeValue);
        return value;
    }

    protected abstract Double changeValue(Double value);

    protected int freight(int size) {
        return 10;
    }

}
