package compound;

/**
 * Created by Swin on 2016/6/17.
 */
public class QuackCounter implements Quackable {
    private Quackable duck;
    public static int quackTimes = 0;
    private Observable observable;

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObserver() {
        observable.notifyObserver();
    }

    public QuackCounter(Quackable duck) {
        this.duck = duck;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        duck.quack();
        quackTimes++;
    }

    public static int getQuackTimes() {
        return quackTimes;
    }
}
