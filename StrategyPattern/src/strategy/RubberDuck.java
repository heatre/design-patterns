package strategy;

/**
 * Created by Swin on 2016/5/17.
 */
public class RubberDuck extends Duck {

    public RubberDuck(){
        super.setFlyBehavior(new FlyNoWay());
        super.setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display(){
        System.out.println("strategy.RubberDuck");
    }
}
