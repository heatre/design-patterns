package observer;

/**
 * Created by Swin on 2016/5/17.
 */
public class ForecastDispaly implements Observer,Dispaly {

    private double temperature;
    private Subject weaterData;

    public ForecastDispaly(Subject subject){
        weaterData = subject;
        weaterData.registerObserver(this);
    }

    @Override
    public void display(){
        System.out.println("Forecast is:");
        System.out.println("temperature:"+temperature);
    }

    @Override
    public void update(double t,double h,double p){
        temperature = t;
        display();
    }
}
