package decorator;

/**
 * Created by Swin on 2016/5/18.
 */
public class DocoratorTest {
    public static void main(String [] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+":"+beverage.cost());

        beverage = new Milk(beverage);
        beverage = new Soy(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription()+":"+beverage.cost());

        Beverage beverage1 = new DarkRoast();
        System.out.println(beverage1.getDescription()+":"+beverage1.cost());

        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription()+":"+beverage1.cost());
    }
}
