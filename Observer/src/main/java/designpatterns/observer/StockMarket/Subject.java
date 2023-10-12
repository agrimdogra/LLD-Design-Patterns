package designpatterns.observer.StockMarket;

public interface Subject {
    public void register(Observer observer);
    public void remove(Observer observer);
    public void notifyObserver();
    public void updateStock(StockName stockName, Double price);
}
