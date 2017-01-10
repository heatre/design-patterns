package observer;

import java.util.ArrayList;

/**
 * Created by Swin on 2016/5/17.
 */
public class WetherData implements Subject {
    private ArrayList<Observer> observers;
    private double tempearature;
    private double humidity;
    private double pressure;

    public WetherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        for (Observer o : observers) {
            if (o == observer) {
                observers.remove(o);
                break;
            }
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(tempearature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(double t,double h,double p){
        tempearature = t;
        humidity = h;
        pressure = p;
        measurementsChanged();
    }
}
