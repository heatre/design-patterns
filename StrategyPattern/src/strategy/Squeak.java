package strategy;

/**
 * Created by Swin on 2016/5/17.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack(){
        System.out.println("strategy.Squeak");
    }
}
