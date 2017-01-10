package adapter;

/**
 * Created by Swin on 2016/5/20.
 */
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
