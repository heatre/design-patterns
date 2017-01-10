package observer;

/**
 * Created by Swin on 2016/5/17.
 */
public class CurrentConditionDisplay implements Observer,Dispaly {
    private double temperature;
    private double humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject subject){
        weatherData = subject;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double t,double h,double p){
        temperature = t;
        humidity = h;
        display();
    }

    @Override
    public void display(){
        System.out.println("current conditions:");
        System.out.println("temperature:"+temperature);
        System.out.println("humidity:"+humidity);
    }
}
