package designpatterns.observer.Implementation.WeatherReporting;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
public class WeatherStation implements Subject{
    List<Observer> observers = new ArrayList<>();
    Double temperature;
    Double humidity;
    Double pressure;

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public void measurementChange(Double temperature, Double humidity, Double pressure){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        notifyObservers();
    }
}
