package FactoryMethod;

/**
 * Created by Swin on 2016/5/18.
 */
public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name = "Chicago cheese pizza";
        dough = "Chicago cheese dough";
        sauce = "Chicago cheese sauce";
        topping.add("Chicago cheese topping");
    }
}
