package compound;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Swin on 2016/6/20.
 */
public class Observable implements QuackObservable {
    private List<Observer> observers = new ArrayList<>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
