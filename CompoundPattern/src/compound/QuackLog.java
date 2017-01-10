package compound;

/**
 * Created by Swin on 2016/6/20.
 */
public class QuackLog implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("quack log:"+duck+"just quack");
    }
}
