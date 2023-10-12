package designpatterns.observer.StockMarket;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Stock {
    StockName stockName;
    String description;
    Double price;

    public Stock(StockName stockName, Double price) {
        this.price = price;
        this.stockName = stockName;
    }
}
