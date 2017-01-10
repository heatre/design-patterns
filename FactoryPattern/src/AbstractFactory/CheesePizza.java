package AbstractFactory;

/**
 * Created by Swin on 2016/5/19.
 */
public class CheesePizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory p){
        pizzaIngredientFactory = p;
    }

    @Override
    public void prepare(){
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
