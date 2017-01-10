package AbstractFactory;

/**
 * Created by Swin on 2016/5/19.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough(){
        return new ThickDough();
    }

    @Override
    public Sauce createSauce(){
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese(){
        return new MozzarellaCheese();
    }

    @Override
    public Clams createClams(){
        return new FrozenClams();
    }
}
