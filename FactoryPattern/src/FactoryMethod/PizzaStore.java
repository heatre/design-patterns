package FactoryMethod;

/**
 * Created by Swin on 2016/5/18.
 */
public abstract class PizzaStore {

    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
