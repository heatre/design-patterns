package strategy;

/**
 * Created by Swin on 2016/5/17.
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck(){
        super.setFlyBehavior(new FlyWithWings());
        super.setQuackBehavior(new Quack());
    }

    @Override
    public void display(){
        System.out.println("ReadHeadDuck");
    }
}
