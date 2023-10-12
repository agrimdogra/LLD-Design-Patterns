package designpatterns.observer.Implementation.WeatherReporting;

public interface Subject {
    public void register(Observer observer);
    public void remove(Observer observer);
    public void notifyObservers();
}
