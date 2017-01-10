package strategy;

/**
 * Created by Swin on 2016/5/17.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack(){
        System.out.println("muteQuack");
    }
}
