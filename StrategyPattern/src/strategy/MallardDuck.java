package strategy;

/**
 * Created by Swin on 2016/5/17.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
    @Override
    public void display(){
        System.out.println("strategy.MallardDuck");
    }
}
