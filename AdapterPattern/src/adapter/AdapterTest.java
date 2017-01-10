package adapter;

/**
 * Created by Swin on 2016/5/20.
 */
public class AdapterTest {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.quack();
        duck.fly();
    }
}
