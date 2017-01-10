package strategy;

/**
 * Created by Swin on 2016/5/17.
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly(){
        System.out.println("I can't fly");
    }
}
