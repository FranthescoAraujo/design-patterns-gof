package patterns.TemplateMethod.pattern;

public class IncreaseOrder extends OrderAbstract {

    @Override
    protected Double changeValue(Double value) {
        return value;
    }
    
}
