package AbstractFactory;

/**
 * Created by Swin on 2016/5/19.
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clams createClams();
}
