package observer;

/**
 * Created by Swin on 2016/5/17.
 */
public class StatisticDisplay implements Observer,Dispaly {
    private double temperature;
    private double humidity;
    private double pressure;
    private Subject weatherData;

    public StatisticDisplay(Subject subject){
        weatherData = subject;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(double t,double h,double p){
        temperature = t;
        humidity = h;
        pressure = p;
        display();
    }

    @Override
    public void display(){
        System.out.println("Statistic is:");
        System.out.println("temperature:"+temperature);
        System.out.println("humidity:"+humidity);
        System.out.println("pressure:"+pressure);
    }
}
