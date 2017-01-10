package compound;

/**
 * Created by Swin on 2016/6/16.
 */
public class RedHeadDuck implements Quackable {
    private Observable observable;

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObserver() {
        observable.notifyObserver();
    }

    public RedHeadDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("red head duck quack");
        notifyObserver();

    }
}
