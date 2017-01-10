package strategy;

/**
 * Created by Swin on 2016/5/17.
 */
public class StrategyTest {
    public static void main(String [] args){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck redHead = new RedHeadDuck();
        redHead.performQuack();
        redHead.performFly();

        Duck rubber = new RubberDuck();
        rubber.performFly();
        rubber.performQuack();

        Duck mute = new DecoyDuck() ;
        mute.performQuack();
        mute.performFly();
    }
}
