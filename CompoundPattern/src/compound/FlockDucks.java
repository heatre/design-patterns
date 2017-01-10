package compound;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Swin on 2016/6/20.
 */
public class FlockDucks implements Quackable {


    public List<Quackable> ducks = new ArrayList<>();

    private Observable observable;

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObserver() {
        observable.notifyObserver();
    }

    public FlockDucks() {
        observable = new Observable(this);
    }

    public void add(Quackable duck) {
        ducks.add(duck);
    }

    @Override
    public void quack() {
        Iterator iterator = ducks.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable) iterator.next();
            duck.quack();
            notifyObserver();
        }
    }
}
