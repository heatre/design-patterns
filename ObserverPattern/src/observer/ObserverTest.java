package observer;

/**
 * Created by Swin on 2016/5/17.
 */
public class ObserverTest {
    public static void main(String [] args){
        WetherData weatherData = new WetherData();
        Observer currentCondition = new CurrentConditionDisplay(weatherData);
        Observer statistic = new StatisticDisplay(weatherData);
        Observer forecast = new ForecastDispaly(weatherData);
        weatherData.setMeasurements(80,65,30);
        weatherData.setMeasurements(81,66,31);
        weatherData.setMeasurements(82,67,32);
    }
}
