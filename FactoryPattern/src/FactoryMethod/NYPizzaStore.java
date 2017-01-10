package FactoryMethod;

/**
 * Created by Swin on 2016/5/18.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new NYStyleCheesePizza();
                break;
            case "veggie":
                pizza = new NYStyleVeggiePizza();
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
}
