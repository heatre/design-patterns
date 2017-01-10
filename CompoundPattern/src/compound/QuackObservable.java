package compound;

/**
 * Created by Swin on 2016/6/20.
 */
public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObserver();
}
