package designpatterns.observer.Implementation.WeatherReporting;

import lombok.ToString;


@ToString
public class CurrentConditionDisplay implements Observer, Display{
    WeatherStation weatherStation;
    Double temperature;
    Double humidity;
    Double pressure;

    public CurrentConditionDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.register(this);
    }

    @Override
    public void Display() {
        System.out.println(this);
    }

    @Override
    public void update() {
        this.temperature = weatherStation.getTemperature();
        this.humidity = weatherStation.getHumidity();
        this.pressure = weatherStation.getHumidity();
        System.out.println("CurrentCondition has Updated");
        Display();
    }
}
