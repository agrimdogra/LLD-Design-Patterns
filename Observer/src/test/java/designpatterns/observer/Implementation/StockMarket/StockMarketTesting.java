package designpatterns.observer.Implementation.StockMarket;

import designpatterns.observer.StockMarket.PaytmCustomers;
import designpatterns.observer.StockMarket.StockMarketNews;
import designpatterns.observer.StockMarket.StockMarketStation;
import designpatterns.observer.StockMarket.StockName;
import org.junit.jupiter.api.Test;

public class StockMarketTesting {
    @Test
    public void testStocks(){
        StockMarketStation stockMarketStation = new StockMarketStation();
        System.out.println(stockMarketStation);

        StockMarketNews stockMarketNews = new StockMarketNews(stockMarketStation);
        stockMarketNews.register();
        PaytmCustomers paytmCustomers = new PaytmCustomers(stockMarketStation);
        paytmCustomers.register();

        stockMarketStation.updateStock(StockName.MRF, 500.0);
    }
}
