package FactoryMethod;

/**
 * Created by Swin on 2016/5/18.
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(){
        name = "NY Cheese Pizza";
        dough = "NY Cheese dough";
        sauce = "NY Cheese sauce";
        topping.add("NY Cheese topping");
    }
}
