package AbstractFactory;

/**
 * Created by Swin on 2016/5/19.
 */
public class ClamsPizza extends Pizza {
    private PizzaIngredientFactory pizzaIngredientFactory;

    public ClamsPizza(PizzaIngredientFactory p){
        pizzaIngredientFactory = p;
    }
    @Override
    public void prepare(){
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        clams = pizzaIngredientFactory.createClams();
    }
}
