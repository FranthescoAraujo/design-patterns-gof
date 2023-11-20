package patterns.TemplateMethod.pattern;

public class DiscountOrder extends OrderAbstract {

    @Override
    protected Double changeValue(Double value) {
        return -value;
    }
    
}
