package AbstractFactory;

/**
 * Created by Swin on 2016/5/19.
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza.toString());

        pizzaStore = new ChicagoPizzaStore();
        pizza = pizzaStore.orderPizza("clams");
        System.out.println(pizza.toString());
    }
}
