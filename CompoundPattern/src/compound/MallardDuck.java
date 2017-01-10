package compound;

/**
 * Created by Swin on 2016/6/16.
 */
public class MallardDuck implements Quackable {
    Observable observable;

    public MallardDuck() {
        observable = new Observable(this);
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObserver() {
        observable.notifyObserver();
    }

    @Override
    public void quack() {
        System.out.println("mallard duck quack");
        notifyObserver();
    }
}
