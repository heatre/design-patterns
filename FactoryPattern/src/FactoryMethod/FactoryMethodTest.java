package FactoryMethod;

/**
 * Created by Swin on 2016/5/18.
 */
public class FactoryMethodTest {
    public static void main(String [] args){
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza.toString());

        pizzaStore = new ChicagoPizzaStore();
        pizza = pizzaStore.orderPizza("veggie");
        System.out.println(pizza.toString());
    }
}
