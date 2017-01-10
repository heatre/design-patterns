package compound;

/**
 * Created by Swin on 2016/6/16.
 */
public class RubberDuck implements Quackable {
    private Observable observable;

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObserver() {
        observable.notifyObserver();
    }

    public RubberDuck() {
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("rubber duck squeak");
        notifyObserver();
    }
}
