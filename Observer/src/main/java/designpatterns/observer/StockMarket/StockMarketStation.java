package designpatterns.observer.StockMarket;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class StockMarketStation implements Subject {
    List<Observer> observers = new ArrayList<>();
    Map<StockName, Stock> registeredStocks = new HashMap<>();

    public StockMarketStation() {
        registeredStocks.put(StockName.SAP, new Stock(StockName.SAP, "This is an SAP Stock", 133.0));
        registeredStocks.put(StockName.PAYTM, new Stock(StockName.PAYTM, "This is an PAYTM Stock", 79.80));
        registeredStocks.put(StockName.MRF, new Stock(StockName.MRF, "This is an MRF Stock", 200.0));
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers){
            observer.update();
        }
    }


    public void updateStock(StockName stockName, Double price){
        registeredStocks.get(stockName).setPrice(price);
        notifyObserver();
    }
}
