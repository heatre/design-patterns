package observer;

/**
 * Created by Swin on 2016/5/17.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
