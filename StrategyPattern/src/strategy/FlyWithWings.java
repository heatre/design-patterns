package strategy;

/**
 * Created by Swin on 2016/5/17.
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly(){
        System.out.println("duck can fly with wings");
    }
}
