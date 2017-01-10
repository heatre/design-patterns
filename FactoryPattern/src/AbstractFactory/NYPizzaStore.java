package AbstractFactory;

/**
 * Created by Swin on 2016/5/19.
 */
public class NYPizzaStore extends PizzaStore {
    private PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza(pizzaIngredientFactory);
                break;
            case "clams":
                pizza = new ClamsPizza(pizzaIngredientFactory);
                break;
            case "veggie":
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
}
