package strategy;

/**
 * Created by Swin on 2016/5/17.
 */
public class DecoyDuck extends Duck {

    public DecoyDuck(){
        setQuackBehavior(new Squeak());
        setFlyBehavior(new FlyNoWay());
    }

    @Override
    public void display(){
        System.out.println("strategy.DecoyDuck");
    }

    @Override
    public void swim(){
        System.out.println("No swim");
    }
}
