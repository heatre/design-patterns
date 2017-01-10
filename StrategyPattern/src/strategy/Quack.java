package strategy;

/**
 * Created by Swin on 2016/5/17.
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
       System.out.println("quack");
    }
}
