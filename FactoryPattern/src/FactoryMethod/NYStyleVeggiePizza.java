package FactoryMethod;

/**
 * Created by Swin on 2016/5/18.
 */
public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza(){
        name = "NY Veggie Pizza";
        dough = "NY Veggie dough";
        sauce = "NY Veggie sauce";
        topping.add("NY Veggie topping");
    }
}
