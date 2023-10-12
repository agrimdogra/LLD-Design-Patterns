package designpatterns.observer.StockMarket;


public class StockMarketNews implements Observer {

    StockMarketStation stockMarketStation;

    public StockMarketNews(StockMarketStation stockMarketStation) {
        this.stockMarketStation = stockMarketStation;
    }

    @Override
    public void update() {
        System.out.println("I am StockMarketNews");
        System.out.println(stockMarketStation.getRegisteredStocks());
    }

    @Override
    public void deRegister() {
        stockMarketStation.remove(this);
    }

    @Override
    public void register() {
        stockMarketStation.register(this);
    }
}
