package patterns.TemplateMethod.client;

import patterns.TemplateMethod.pattern.DiscountOrder;
import patterns.TemplateMethod.pattern.IncreaseOrder;
import patterns.TemplateMethod.pattern.OrderAbstract;

public class Main {
    
    public static void main(String[] args) {
        
        Double value = 190.0;
        Double changeValue = 20.0;

        OrderAbstract discountOrder = new DiscountOrder();
        Double discountValue = discountOrder.finalValue(value, 40, changeValue);
        System.out.println(discountValue);

        OrderAbstract increaseOrder = new IncreaseOrder();
        Double increaseValue = increaseOrder.finalValue(value, 40, changeValue);
        System.out.println(increaseValue);

    }

}
