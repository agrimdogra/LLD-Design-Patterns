package designpatterns.observer.Implementation.WeatherReporting;

import org.junit.jupiter.api.Test;

public class WeatherReportingObserverTest {
    @Test
    public void testCurrentConditionDisplay(){
        WeatherStation weatherStation = new WeatherStation();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherStation);
        weatherStation.measurementChange(27.6, 90.0,100.9);
        weatherStation.remove(currentConditionDisplay);
        Observer observer = () -> System.out.println("!!Lambda Notified!!");
        weatherStation.register(observer);
        System.out.println("After removing!!!");
        weatherStation.measurementChange(28.9,29.5,30.0);


    }
}
